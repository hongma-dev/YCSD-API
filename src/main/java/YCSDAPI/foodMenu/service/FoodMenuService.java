package YCSDAPI.foodMenu.service;

import java.util.List;
import java.util.Optional;

import YCSDAPI.foodMenu.model.FoodMenu;

public interface FoodMenuService {

	List<FoodMenu> getFoodMenus (  ) ;
	
	Optional<FoodMenu> findFoodMenu ( Long menuId );
	
	void saveFoodMenu ( FoodMenu foodMenu );
	
	void deleteFoodMenu ( FoodMenu foodMenu );
}
