# yaml语法
键值对的方式(k: v)  
左对齐为同一层级关系  
''会把转义字符进行转义，例如 (\n)会有\n输出 
"" 则与之相反!!!
## 配置文件取值 
@ConfigurationProperties 可以批量取值   
默认从全局配置文件里面取值 
可以支持驼峰命名写法的松散绑定 
配合@Validated注解可以支持数据校验
@Value 单个取值
需要与之一一对应 
#### 复杂类型建议用@ConfigurationProperties
#### 简单类型则用@Value 
配置文件激活方式 
spring.profile.active
yaml文件以---分文档模块
