# bookController
## 项目历程
1. 10.2日图书管理系统大部分功能已基本完成  表单校验全部有前端完成 
2. 10.2日下午 更新了根据名称查找书本的功能
3. 10.7日下午 更新了注册功能 
## 待完成项目

1. 权限控制
2. 登录 注册
3. 借阅系统
4. 异常管理
 
## 另记
### 10.6 
更新了登录功能 可以正确跳转到root界面 但是 目前并不能携带control层返回的用户信息, 还需要设计普通用户登录后返回的界面,以及对未登录用户的权限控制 让他们跳转到登录界面
### 10.7
将axios的版本号修改为了1.0.0 解决了 1.1.0版本中出现的axios.post is not a function的问题
做了一个简单的注解界面 表单的校验为 不为空 且 账号不超过11位密码不超过20位 默认的用户权限为user
由于数据库不允许用户名重复 如果注册时填写的用户名重复的话 可以会导致出现500 内部服务器异常 问题原因为 没有异常管理模块
