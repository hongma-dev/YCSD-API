package YCSDAPI.foodMenu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import YCSDAPI.foodMenu.model.FoodMenu;

@Repository
public interface FoodMenuRepository extends JpaRepository<FoodMenu, Long> {
	
}
