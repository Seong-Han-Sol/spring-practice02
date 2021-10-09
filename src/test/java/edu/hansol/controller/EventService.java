package edu.hansol.controller;

public class EventService {
	
	public void test(){
		Event event1 = new Event();
		event1.setTitle("1차 스터디");
		
		Event event2 = new Event(2,"2차 스터디","2021-10-09","2021-10-09");
	}
}
