package com.pramata.Services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pramata.Entity.Status;
import com.pramata.Repositery.StatusRepo;

@Service
public class StatusServices {
	
	@Autowired
	private StatusRepo statusRepo;
	
	public Status saveStatus(Status status) {
		return statusRepo.save(status);
	}
	
	public ArrayList<Status> getAllStatsHandler(){
		return statusRepo.findAll();
	}

}
