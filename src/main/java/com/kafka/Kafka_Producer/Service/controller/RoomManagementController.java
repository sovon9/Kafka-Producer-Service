package com.kafka.Kafka_Producer.Service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.kafka.Kafka_Producer.Service.dto.Room;
import com.kafka.Kafka_Producer.Service.service.KafkaProducerService;

@RestController
public class RoomManagementController
{
	KafkaProducerService producerService;
	@Autowired
	public RoomManagementController(KafkaProducerService producerService)
	{
		this.producerService = producerService;
	}


//	@GetMapping("/updateRooms/{status}")
//	public ResponseEntity<Void> updateStatus(@PathVariable(name = "status") String status)
//	{
//		try
//		{
//			producerService.publish(status);
//			return new ResponseEntity<Void>(HttpStatus.OK);
//		}
//		catch (Exception e) {
//			return new ResponseEntity<Void>(HttpStatus.INTERNAL_SERVER_ERROR);
//		}
//	}
	
	@GetMapping("/publishRoom")
	public ResponseEntity<Void> publishRoom()
	{
		try
		{
			Room room = new Room();
			room.setGuestID(1234L);
			producerService.publishRoomEvent(room);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		catch (Exception e) {
			return new ResponseEntity<Void>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
