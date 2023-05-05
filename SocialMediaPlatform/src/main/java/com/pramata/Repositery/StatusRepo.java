package com.pramata.Repositery;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pramata.Entity.Status;

public interface StatusRepo extends JpaRepository<Status, Integer>{
	
	Status save(Status status);
	ArrayList<Status>findAll();

}
