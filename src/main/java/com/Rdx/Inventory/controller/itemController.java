package com.Rdx.Inventory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.WebExceptionHandler;

import com.Rdx.Inventory.entity.item;
import com.Rdx.Inventory.service.itemService;

@RestController
public class itemController{

	@Autowired
	itemService is;
	
	@GetMapping("/allitem")
	public List<item> getAllItem(){
		return is.getItem();
	}
	
	@GetMapping("/item/{id}")
	public item getById(@PathVariable("id") int id) {
			return is.getById(id);
	}
	
	@PostMapping("/addItem")
	public void addItem(@RequestBody item newitem){
		is.addItem(newitem);
		System.out.println("Done");
	}
	
	
}
