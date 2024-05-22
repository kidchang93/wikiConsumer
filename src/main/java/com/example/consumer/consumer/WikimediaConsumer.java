package com.example.consumer.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class WikimediaConsumer {
	
	 @KafkaListener(topics = "wikimedia-stream", groupId = "myGroup")
	 public void consumeMsg(String msg) {
	 
		 log.info("Consuming the message from wikimedia-stream Topic :: " + msg);
	 // Please fel free to do anything you want with the data
	}
	
}
