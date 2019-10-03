package com.hence4.hence.controllers;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.hence4.hence.models.Entities;
import com.hence4.hence.repositories.EntityRepository;

@CrossOrigin( origins = "http://localhost:4200" )
@RestController
@RequestMapping(value = "/entities")

public class EntityController {

	@Autowired
    private EntityRepository repository;
	 @RequestMapping(value = "", method = RequestMethod.GET)
	    public List<Entities> getAllEntities() {
	        return repository.findAll();
	        
	   } 
	 @RequestMapping(value = "/post", method = RequestMethod.POST)
	    public Entities addNewEntity(@RequestBody Entities entities) {
	    	System.err.println("yes it works!");
	    	entities.setId(ObjectId.get().toString());
	        repository.save(entities);
	        return entities;
	    }
	
}
