package com.pramata.Controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.pramata.Entity.Status;
import com.pramata.Services.StatusServices;

@RestController
@RequestMapping("/api/status")
public class StatusController {
	
	@Autowired
	private StatusServices services;
	
	@PostMapping("/save")
	public Status saveStatusHandler(@RequestBody Status status) {
		return services.saveStatus(status);
	}
	
	
	
	@GetMapping("/getallStatus")
	public ArrayList<Status>getAllStatusHandler(){
		return services.getAllStatsHandler();
	}
	

}
