## sky Cloud  Service 项目

### 项目介绍
本项目为 skycloud 业务模块,依赖于[skycloud-base](http://code.sky.cn:9090/spring-cloud/skycloud-base)模块。
  
### 平台目录结构说明

```
整体代码目录

├─skycloud-service----------------------------父项目，公共依赖
│  │
│  ├─skycloud-generator-tool-------------------------代码生成工具(废弃)
│  │
│  ├─skycloud-service-common-------------------------公共包
│  │
│  ├─skycloud-service-member----------------------------会员服务
│  │
│  ├─skycloud-service-member-api------------------------会员服务API
│  │
│  │
```


```
独立项目目录

├─skycloud-service-----------------------------订单中心
│  │
│  │─java-------------------------源码文件
│  │   │
│  │   ├──aop-------------------------------切面
│  │   │
│  │   ├──config----------------------------配置
│  │   │
│  │   ├──mapper----------------------------dal
│  │   │
│  │   ├──model-----------------------------实体pojo
│  │   │    │
│  │   │    ├──doamin-----------------------数据库实体
│  │   │    │
│  │   │    ├──dto--------------------------传输DTO
│  │   │    │
│  │   │    ├──vo---------------------------页面vo
│  │   │    │
│  │   ├──service---------------------------业务层
│  │   │
│  │   ├──manager---------------------------管理层(如 redis )
│  │   │
│  │   ├──web-------------------------------用户中心API
│  │   │
│  │   ├──SkyCloudApplication---------启动类
│  │   │
│  │─resource----------------------资源文件
│  │   │
│  │   ├──mapper----------------------------sql xml
│  │   │
│  │   ├──application.yml-------------------属性文件
│  │
│  │
```

### 开发规范

~~- 使用skycloud-generator-tool生成 domain mapper xml (后期可能基于freemarker写一套生成器)~~
    ~~- 使用方法
       - 修改config.properties 文件 jdbc.url 日志
       - 修改generatorConfig.xml 文件
       - 运行PaginationPlugin 生成文件~~
       
- [代码生成器](https://github.com/xk11961677/skycloud-base/tree/master/skycloud-base-codegen)       
- 入参 MessageReq<T> 出参MessageRes<T>
- 业务验证器(废弃)[使用方式](https://github.com/xk11961677/framework/tree/master/framework-integrate/framework-integrate-validator)
- 业务验证器(hibernate-validator)

- service层 接口继承 IService<T> 实现类继承 BaseService<T>
    - 如 OrderService extends IService<Order> 
    - 如 OrderServiceImpl extends BaseService<Order> implements OrderService
    - 分页代码如下 Pagination 分页类 OrderReqDto继承BaseQueryPageRequestDto ,ModelMapper 实体转换工具
    ```
    @Override
    public Pagination queryOrderListWithPage(OrderReqDto orderPageQuery) {
        PageHelper.startPage(orderPageQuery.getPageNum(), orderPageQuery.getPageSize());
        List<Order> orderList = OrderMapper.selectByUserId(orderPageQuery.getUserId());
        Type targetListType = new TypeToken<List<OrderVo>>() {}.getType();
        ModelMapper mapper = new ModelMapper();
        List<OrderVo> orderVoList = mapper.map(orderList, targetListType);
        return new Pagination(orderPageQuery.getPageNum(),orderPageQuery.getPageSize(),0,orderVoList);
    }
    ```
- mapper层继承 MyMapper<T>
- 业务异常继承BusinessException 
- 错误码实现ErrorCode , 如 ErrorCodeEnum implements ErrorCode
    - MEMBER160001(160001, "您验证次数过多，请1小时后重试!")
    
- 区分domain、dto、vo ，不要把po中的所有字段都返回给前端。 前端需要什么字段，就返回什么字段
    - DTO 分页继承 BaseQueryPageRequestDto
 
- 业务模块接口层命名为`skycloud-service-xxx-api`，如`skycloud-service-member-api` 
    - 提供feign客户端，dto exception
- 业务模块层命名为`skycloud-service-xxx`，如`skycloud-service-member`
- 每个项目必须有 readme.md 文件
- 数据表命名为：`dl`_`表`，如`dl_user`
    - 必须有如下字段
    ```
      id           BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '主键id',
      created_time TIMESTAMP     NOT NULL DEFAULT now() COMMENT '创建时间',
      updated_time TIMESTAMP     NOT NULL DEFAULT now() COMMENT '更新时间',
      created_by   VARCHAR(100) NOT NULL COMMENT '创建人',
      updated_by   VARCHAR(100) NOT NULL COMMENT '更新人',
      disabled                int COMMENT '数据是否有效(0 有效 1 无效)'
    ```
- 更多规范，参考[阿里巴巴Java开发手册]



### FAQ

### 业务架构图