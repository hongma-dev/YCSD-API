package YCSDAPI.foodMenu.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import YCSDAPI.foodMenu.model.FoodMenu;
import YCSDAPI.foodMenu.repository.FoodMenuRepository;

@Service
public class FoodMenuServiceImpl implements FoodMenuService{

	@Autowired
	FoodMenuRepository foodMenuRepository;
	
	@Override
	public List<FoodMenu> getFoodMenus() {
		List<FoodMenu> foodMenus = foodMenuRepository.findAll();
		return foodMenus;
	}

	@Override
	public Optional<FoodMenu> findFoodMenu(Long menuId) {
		Optional<FoodMenu> findFoodMenu = foodMenuRepository.findById(menuId);
		return findFoodMenu;
	}

	
	@Override
	public void saveFoodMenu(FoodMenu foodMenu) {
		foodMenuRepository.save(foodMenu);
	}

	
}
