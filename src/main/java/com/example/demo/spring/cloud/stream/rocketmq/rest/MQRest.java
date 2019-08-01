package com.example.demo.spring.cloud.stream.rocketmq.rest;

import com.example.demo.spring.cloud.stream.rocketmq.client.StreamClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * 请求路径 调用后查看消息消费
 * @author zongkun
 * @since 19-7-31
 */
@RestController
@RequestMapping("test")
public class MQRest {

    @Autowired
    StreamClient streamClient;

    @GetMapping("mq")
    public void test(){
        String now = "now" + new Date();
        streamClient.output1().send(MessageBuilder.withPayload(now).build());
    }
}

