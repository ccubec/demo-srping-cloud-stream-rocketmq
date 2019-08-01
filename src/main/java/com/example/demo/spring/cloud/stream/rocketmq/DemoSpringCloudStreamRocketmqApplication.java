package com.example.demo.spring.cloud.stream.rocketmq;

import com.example.demo.spring.cloud.stream.rocketmq.client.StreamClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.cloud.stream.messaging.Source;

@SpringBootApplication
@EnableBinding({StreamClient.class})
public class DemoSpringCloudStreamRocketmqApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringCloudStreamRocketmqApplication.class, args);

		System.out.println("启动成功");
	}

}
