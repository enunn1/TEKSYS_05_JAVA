package com.example.dependiceioc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.dependiceioc.entity.Item;
import com.example.dependiceioc.repository.ItemRepo;

@Controller
public class ItemController {

	// Constructor Dependency Injection
//	private ItemRepo itemRepo;
//	ItemController(ItemRepo itemRepo) {
//		this.itemRepo = itemRepo;
//	}
	
	// Setter Dependency Injection
//	private ItemRepo itemRepo;
//	public void setItemRepo(ItemRepo itemRepo) {
//		this.itemRepo = itemRepo;
//	}
	
	// coupling
	
	// tight coupling
	// loose coupling
	
	// Field-based dependency injection
	@Autowired
//	@Qualifier("itemRepo")
	private ItemRepo itemRepo;
	
	@GetMapping(path="/about")
	public String show() {
		return "Hello to all";
	}
	
	@PostMapping(path= "/add/{name}/{price}")
	public void add(@PathVariable String name,  @PathVariable int price) {
		Item newItem = new Item();
		newItem.setName(name);
		newItem.setPrice(price);
		itemRepo.save(newItem);
	}
}
