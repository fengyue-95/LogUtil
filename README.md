#使用方式
###MethodParamLog
####支持打印方法的入参，方法执行时间统计（countExecuteTime = true 默认为false）


###PlaceholderLog（支持对象类型和基本数据类型）
####支持自定义文本；配置应用上下文用户对象  


`@PlaceholderLog(content = "当前用户:#{#applicationUserContext.username+ '我是p0：'+ #p0['name'] + '的年龄是:' + #p0['age'] +  '我是p1：'+ #p1['name'] + '的年龄是:' + #p1['age'] +'地址是：'+#p1['address']+'我是p2：'+ #p2['name'] + '的年龄是:' + #p2['age'] + '字符串测试'+#p3}",
                                currentUser = ApplicationUserContext.class)`


`<bean id="applicationUserContext" class=" com.github.autolog.context.ApplicationUserContext">
 		<property name="username" value="zhangsan"/>
 	</bean>`

###使用参考：
####com.github.autolog.controller.IndexController.person(com.github.autolog.dto.TestParam)


