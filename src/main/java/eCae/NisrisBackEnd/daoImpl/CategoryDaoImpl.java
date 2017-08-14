package eCae.NisrisBackEnd.daoImpl;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import eCae.NisrisBackEnd.dao.CategoryDao;
import eCae.NisrisBackEnd.model.Category;


@Repository
public class CategoryDaoImpl implements CategoryDao  {
	@Autowired
	SessionFactory sf;
	@Override
	public boolean addCategory(Category category){
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		s.save(category);
		t.commit();
		return true;
	}
		
		@Override
		public ArrayList<Category> gatAllCategory() {
			ArrayList<Category> list;
			Session s = sf.openSession();
			Transaction t = s.beginTransaction();
			list = (ArrayList<Category>) s.createQuery("from Category").list();
			t.commit();
			return list;
		}
	}

