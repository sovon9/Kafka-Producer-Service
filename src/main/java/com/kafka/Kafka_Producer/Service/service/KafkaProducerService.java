package com.kafka.Kafka_Producer.Service.service;

import java.util.concurrent.CompletableFuture;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;

import com.kafka.Kafka_Producer.Service.dto.Room;

@Service
public class KafkaProducerService
{
	Logger LOGGER = LoggerFactory.getLogger(KafkaProducerService.class);
	KafkaTemplate<String, Object> kafkaTemplate;

	@Autowired
	public KafkaProducerService(KafkaTemplate<String, Object> kafkaTemplate)
	{
		this.kafkaTemplate = kafkaTemplate;
	}
	
//	public void publish(String status)
//	{
//		try
//		{
//			CompletableFuture<SendResult<String, Object>> completableFuture = kafkaTemplate.send("PMS", status);
//			completableFuture.whenComplete((result, exception) -> {
//				if (null == exception)
//				{
//					System.out.println("=======> partition no: " + result.getRecordMetadata().partition()
//							+ " offset id: " + result.getRecordMetadata().offset());
//				}
//				else
//				{
//					System.out.println("exceptiom=> " + exception.getMessage());
//				}
//			});
//		}
//		catch (Exception e)
//		{
//			LOGGER.error("Error while publishing the message to Kafka: "+e.getMessage());
//		}
//	}
	
	/**
	 * 
	 * @param room
	 */
	public void publishRoomEvent(Room room)
	{
		try
		{
			CompletableFuture<SendResult<String, Object>> completableFuture = kafkaTemplate.send("PMS1", room);
			completableFuture.whenComplete((result, exception) -> {
				if (null == exception)
				{
					System.out.println("=======> partition no: " + result.getRecordMetadata().partition()
							+ " offset id: " + result.getRecordMetadata().offset());
				}
				else
				{
					System.out.println("exceptiom=> " + exception.getMessage());
				}
			});
		}
		catch (Exception e)
		{
			LOGGER.error("Error while publishing the message to Kafka: "+e.getMessage());
		}
	}
	
}
