package com.pluralsight.NorthwindTradersAPI4.dao.interfaces;

import com.pluralsight.NorthwindTradersAPI4.models.Category;

import java.util.List;

public interface ICategoryDAO {

    List<Category> getAllCatergory();

    Category getById(int categoryId);

    Category add(Category category);

}
