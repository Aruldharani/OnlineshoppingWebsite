package com.project.Dao;

import java.util.List;

import com.project.Model.Shop;

public interface ShopDaoInterface {

	void createStudent(Shop s1);

	List<Shop> getShop();

	Shop getStudent(String id);

	void deleteStudent(Shop s1);

}
