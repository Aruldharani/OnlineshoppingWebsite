package com.project.Service;

import com.project.Model.Shop;

import java.util.List;

public interface ShopServiceInterface {

	void createStudent(Shop s1);
	
	List<Shop> getShop();

	Shop getStudent(String id);

	void deleteUser(Shop s1);

}
