package com.example.demo.spring.cloud.stream.rocketmq.reciver;

import com.example.demo.spring.cloud.stream.rocketmq.client.StreamClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

/** 消息接收者通过监听器监听配置的名称
 * @author zongkun
 * @since 19-7-31
 */
@Component
@EnableBinding(StreamClient.class)
@Slf4j
public class MQReciver {

    @StreamListener("input1")
    public void test(String message){
        log.info("消息是： ----》" + message);
    }
}

