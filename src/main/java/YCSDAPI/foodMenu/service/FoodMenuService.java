package YCSDAPI.foodMenu.service;

import java.util.List;

import YCSDAPI.foodMenu.model.FoodMenu;

public interface FoodMenuService {

	List<FoodMenu> getFoodMenus (  ) ;
	
	FoodMenu findFoodMenu ( Long menuId );
}
