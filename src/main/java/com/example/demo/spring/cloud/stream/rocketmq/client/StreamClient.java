package com.example.demo.spring.cloud.stream.rocketmq.client;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

/**
 * 自定义订阅发布者 对应yml配置项
 * @author zongkun
 * @since 19-7-31
 */
public interface StreamClient {

    @Input("input1")
    SubscribableChannel input1();

    @Output("output1")
    MessageChannel output1();
}
