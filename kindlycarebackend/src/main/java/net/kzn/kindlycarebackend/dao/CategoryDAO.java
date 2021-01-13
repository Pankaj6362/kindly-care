package net.kzn.kindlycarebackend.dao;

import java.util.List;

import net.kzn.kindlycarebackend.dto.Category;

public interface CategoryDAO {

	List<Category> list();
	Category get(int id);
}
