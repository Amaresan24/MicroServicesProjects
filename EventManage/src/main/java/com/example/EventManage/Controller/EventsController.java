package com.example.EventManage.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.EventManage.Entity.EventsList;
import com.example.EventManage.Service.EventsService;


public class EventsController {

	

	@Autowired
	EventsService es;

// event Same should be unqiue 

	@PostMapping(value = "/post_data")
	public String postEvent(@RequestBody EventsList e) {
     return es.postEvent(e);

	}

	@PostMapping(value = "/post_allEvents")
	public String postall_events(@RequestBody List<EventsList> a) {

		return es.postall_events(a);

	}

	@GetMapping(value = "/getevent_id/{a}")
	public EventsList getEvent_id(@PathVariable int a) {
		return es.getEvent_id(a);

	}

	@GetMapping(value = "/getall_events")
	public List<EventsList> gettotal_event() {
		return es.gettotal_event();
	}

	@PutMapping(value = "/update_eventdetails/{a}")
	public String updateEvents(@RequestBody EventsList e, @PathVariable int a) {
		return es.updateEvents(e, a);

	}

	@DeleteMapping(value = "/delete_events/{a}")
	public String deleteEvent(@PathVariable int a) {

		return es.deleteEvent(a);
	}

	// one date how many Event

	@GetMapping(value = "/dateBy_event/{a}")
	public List<EventsList> date_event(@PathVariable String a) {

		return es.date_event(a);
	}

	// when Create Event

	@GetMapping(value = "/create_event/{a}")
	public List<EventsList> create_Event(@PathVariable String a) {
     return es.create_Event(a);
	}

	
}
