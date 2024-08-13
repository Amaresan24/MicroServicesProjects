package com.example.EventManage.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.EventManage.Entity.EventsList;


public interface EventsRepo extends  JpaRepository<EventsList, Integer> {

}
