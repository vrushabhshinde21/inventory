package com.Rdx.Inventory.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Rdx.Inventory.Repository.itemRepo;
import com.Rdx.Inventory.entity.item;

@Service
public class itemService {

	@Autowired
	itemRepo repo;
	
	public List<item> getItem() {
		return repo.findAll();	}

	public void addItem(item newitem) {
		repo.save(newitem);
	}

	public item getById(int id) {
		return repo.getReferenceById(id);
	}
}
