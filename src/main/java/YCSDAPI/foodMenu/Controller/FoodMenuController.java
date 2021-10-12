package YCSDAPI.foodMenu.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@GetMapping(path="/findFoodMenu/{id}")
	public Optional<FoodMenu> findFoodMenu ( @PathVariable Long id ) {
		
		Optional<FoodMenu> findFoodMenu = foodMenuService.findFoodMenu(id);
		
		return findFoodMenu;
	}
	
	@PostMapping(path="/saveFoodMenu")
	public void saveFoodMenu ( @RequestBody FoodMenu foodMenu ) {
		
		foodMenuService.saveFoodMenu(foodMenu);
	}
	
	@PutMapping(path="/saveFoodMenu")
	public void updateFoodMenu ( @RequestBody FoodMenu foodMenu) {
		foodMenuService.saveFoodMenu(foodMenu);
	}
	
	@DeleteMapping(path="/deleteFoodMenu")
	public void deleteFoodMenu ( @ModelAttribute FoodMenu foodMenu  ) {
		foodMenuService.deleteFoodMenu(foodMenu);
	}

}
