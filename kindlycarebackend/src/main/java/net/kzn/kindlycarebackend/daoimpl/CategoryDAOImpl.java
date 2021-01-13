/**
 * 
 */
package net.kzn.kindlycarebackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository; 

import net.kzn.kindlycarebackend.dao.CategoryDAO;
import net.kzn.kindlycarebackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	private static List<Category> categories = new ArrayList<>();

	static {
		Category category = new Category();

		// adding first category
		category.setId(1);
		category.setName("Winter Care");
		category.setDescription("This is some description of Winter Care");
		category.setImageURL("CAT_1.png");

		categories.add(category);

		// adding second category
		category = new Category();
		category.setId(2);
		category.setName("Home Care");
		category.setDescription("This is some description of Home Care");
		category.setImageURL("CAT_2.png");

		categories.add(category);

		// adding Third category
		category = new Category();
		category.setId(3);
		category.setName("Devices");
		category.setDescription("This is some description of Devices");
		category.setImageURL("CAT_3.png");

		categories.add(category);
	}

	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public Category get(int id) {
		// enhanced for loop
		for(Category category : categories) {
			if(category.getId() == id) return category;
		}
		
		return null;
	}

}
