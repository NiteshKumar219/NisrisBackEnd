/*package eCae.NisrisBackEnd;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import eCae.NisrisBackEnd.dao.CategoryDao;
import eCae.NisrisBackEnd.model.Category;

public class CategoryTest {

	@Test
	public void test() {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.scan("eCae.NisrisBackEnd");
       ctx.refresh();
       CategoryDao cd = (CategoryDao)ctx.getBean(CategoryDao.class);
       
       Category c = new Category();
       c.setCid(12455);
       c.setName("Dell");
	assertTrue(cd.addCategory(c));
	}
	

}
*/