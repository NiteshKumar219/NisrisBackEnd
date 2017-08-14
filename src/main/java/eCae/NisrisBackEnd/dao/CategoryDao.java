package eCae.NisrisBackEnd.dao;

import java.util.ArrayList;
import eCae.NisrisBackEnd.model.Category;

public interface CategoryDao {
	
boolean addCategory(Category category);

ArrayList<Category>gatAllCategory();

}
