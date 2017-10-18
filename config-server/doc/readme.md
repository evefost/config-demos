 -   配置中心启动信息
选择native配置
Adding property source: file:F:/spring-cloud-projects/config-demos/config-repo/lession-2-sms-sys-dev.yml
Adding property source: file:F:/spring-cloud-projects/config-demos/config-repo/application-dev.yml
Not adding property source: classpath:/application.yml#dev
Adding property source: file:F:/spring-cloud-projects/config-demos/config-repo/lession-2-sms-sys.yml

查看某个应用的配置文件更新信息:
http://localhost:9002/refresh
通过配置中心查看某个应用的配置信息
http://127.0.0.1:8888/lession-2-sms-sys/dev