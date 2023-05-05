package com.pramata.Entity;

import java.time.LocalDate;

import javax.management.loading.PrivateClassLoader;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Status {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer statusId;
	
	private Integer userId;
	private String statusImageURL;
	private LocalDate uploadTimeDate;
	
	

}
