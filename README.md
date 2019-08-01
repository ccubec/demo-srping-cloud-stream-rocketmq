# demo-srping-cloud-stream-rocketmq

根据spring cloud alibaba rocketmq 整合recketmq示例

window下首先启动rocketmq 

下载地址  http://rocketmq.apache.org/release_notes/release-notes-4.5.1/  选择 binary

首先启动 nameserver       start mqnamesrv.cmd
  
然后启动 broker           start mqbroker.cmd -n 127.0.0.1:9876 autoCreateTopicEnable=true
自定端口号跟 设置自动创建topic

启动项目 localhost:1000/test/mq  

就可以看到打印在控制台的消息了
