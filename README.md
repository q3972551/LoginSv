# LoginSv
登陆服务器，把微信，微博账号登陆手机登陆都已经集合进去了
用web服务器实现，运行的时候将程序放到tomcat上。
为了实现负载，需要 tomcat + nginx 
为了验证，需要把sessionid 存在redis 上，用于提供其他服务器验证此人已经登录
