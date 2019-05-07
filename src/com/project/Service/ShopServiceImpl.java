package com.project.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.Model.Shop;


@Service
public class ShopServiceImpl implements ShopServiceInterface {
	@Autowired
	Shop dao;
	
	@Override
	@Transactional
	public void createStudent(Shop s1) {
			dao.createShop(s1);
	}

	@Override
	@Transactional
	public List<Shop> getShop() {
		return dao.getShop();
	}

	@Override
	@Transactional
	public Shop getStudent(String id) {
		return dao.getShop(id);
	}

	@Override
	@Transactional
	public void deleteUser(Shop s1) {
		dao.deleteShop(s1);
	}

}
