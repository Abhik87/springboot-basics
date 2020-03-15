package com.abhikdutta.springbootquickstart.courseapidata.topic;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Topic {

	@Id
	private String id;
	
	private String name;
	
	private String description;

}
