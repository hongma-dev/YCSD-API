package YCSDAPI.foodMenu.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import YCSDAPI.foodMenu.model.FoodMenu;
import YCSDAPI.foodMenu.service.FoodMenuService;

@RestController
public class FoodMenuController {
	
	@Autowired
	FoodMenuService foodMenuService;
	
	@GetMapping(path="/getFoodMenus")
	public List<FoodMenu> getFoodMenus () {
		
		return foodMenuService.getFoodMenus();
	}
	
//	@GetMapping(path="/findFoodMenu/{id}")
//	public FoodMenu findFoodMenu ( @PathVariable Long id ) {
//		
//		FoodMenu findFoodMenu = foodMenuService.findFoodMenu(id);
//		
//		return findFoodMenu;
//	}

}
