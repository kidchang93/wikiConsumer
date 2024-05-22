package com.example.consumer.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class WikimediaTopicConfig {

	// Apache Broker에 새로운 메시지 브로커를 쓰겠다
	@Bean
	public NewTopic wikimediaStreamTopic() {
		return TopicBuilder
				.name("wikimedia-stream")
				.build();
	}
	// Producer와 동일한 내용이지만 중복이 아니고 별도의 서비스로 간주한다.
	
}
