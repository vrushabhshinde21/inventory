package com.Rdx.Inventory.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Rdx.Inventory.entity.item;

@Repository
public interface itemRepo extends JpaRepository<item, Integer> {
	
}
