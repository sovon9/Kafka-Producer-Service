package com.kafka.Kafka_Producer.Service.dto;

public class Room
{
	private int roomNum;
	private String roomStatus;
	private Long guestID;
	private String ratePlan;
	private String roomDesc;
	private int floor;
	public Room()
	{
		super();
	}
	public int getRoomNum()
	{
		return roomNum;
	}
	public void setRoomNum(int roomNum)
	{
		this.roomNum = roomNum;
	}
	public String getRoomStatus()
	{
		return roomStatus;
	}
	public void setRoomStatus(String roomStatus)
	{
		this.roomStatus = roomStatus;
	}
	public Long getGuestID()
	{
		return guestID;
	}
	public void setGuestID(Long guestID)
	{
		this.guestID = guestID;
	}
	public String getRatePlan()
	{
		return ratePlan;
	}
	public void setRatePlan(String ratePlan)
	{
		this.ratePlan = ratePlan;
	}
	public String getRoomDesc()
	{
		return roomDesc;
	}
	public void setRoomDesc(String roomDesc)
	{
		this.roomDesc = roomDesc;
	}
	public int getFloor()
	{
		return floor;
	}
	public void setFloor(int floor)
	{
		this.floor = floor;
	}
	
}
