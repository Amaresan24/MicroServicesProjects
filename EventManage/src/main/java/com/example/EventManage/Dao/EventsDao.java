package com.example.EventManage.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.EventManage.Entity.EventsList;
import com.example.EventManage.Repo.EventsRepo;

public class EventsDao {
	@Autowired
	EventsRepo er;

	public String postEvent(EventsList e) {
		// TODO Auto-generated method stub
		er.save(e);
		return "data  saved Succesfully";
	}

	public String postall_events(List<EventsList> a) {
		// TODO Auto-generated method stub
		er.saveAll(a);
		return "List of Data saved SuccesFully";
	}

	public EventsList getEvent_id(int a) {
		// TODO Auto-generated method stub
		return er.findById(a).get();
	}

	public List<EventsList> gettotal_event() {
		// TODO Auto-generated method stub
		return er.findAll();
	}

	public String updateEvents(EventsList e) {
		// TODO Auto-generated method stub
		er.save(e);
		return "your data saved SuccesFully";
	}

	public String deleteEvent(int a) {
		// TODO Auto-generated method stub
		er.deleteById(a);
		return "Items Deleted Succesfully";
	}
}
