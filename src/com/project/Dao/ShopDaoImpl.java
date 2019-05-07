package com.project.Dao;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import com.project.Model.Shop;

public class ShopDaoImpl implements ShopDaoInterface {
	@Autowired
	SessionFactory factory;

	@Override
	public void createStudent(Shop s1) {
		Session session = factory.getCurrentSession();
		session.saveOrUpdate(s1);
	}

	@Override
	public List<Shop> getShop() {
		Session session = factory.getCurrentSession();
		Query query = session.createQuery("from Shop");
		List<Shop> students = query.list();
		return students;
	}

	@Override
	public Shop getStudent(String id) {
		Session session = factory.getCurrentSession();
		Shop s1 =session.get(Shop.class,Integer.parseInt(id));
		return s1;
	}

	@Override
	public void deleteStudent(Shop s1) {
		Session session = factory.getCurrentSession();
		session.delete(s1);
	}

	
	

}
