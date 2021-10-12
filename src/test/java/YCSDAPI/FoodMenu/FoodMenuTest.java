package YCSDAPI.FoodMenu;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;

import YCSDAPI.foodMenu.model.FoodMenu;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@AutoConfigureMockMvc
public class FoodMenuTest {
	
	@Autowired
	private MockMvc mockMvc;
	
	@Autowired
	ObjectMapper objMapper;
	
	@Test
	public void getFoodMenus() throws Exception{
		mockMvc.perform(get("/getFoodMenus"))
				.andExpect(status().isOk())
				.andDo(print())
				;
	}
	
	@Test
	public void findFoodMenu() throws Exception{
		Long menuId = 1L;
		
		mockMvc.perform(get("/findFoodMenu/"+menuId))
				.andExpect(status().isOk())
				.andDo(print())
				;
	}
	
	@Test
	public void saveFoodMenu() throws Exception{
		FoodMenu foodMenu = new FoodMenu();
		foodMenu.setMenuName("삼겹살");
		foodMenu.setMenuPrice(9000);
		foodMenu.setMenuCntn("쫄깃한 삼겹살");
		foodMenu.setRegUser("SYSTEM");
		foodMenu.setUpdtUser("SYSTEM");
		
		System.out.println("VALUE : "+this.objMapper.writeValueAsString(foodMenu));
		
		mockMvc.perform(post("/saveFoodMenu")
						.contentType(MediaType.APPLICATION_JSON_UTF8)
						.content(this.objMapper.writeValueAsString(foodMenu)))
				.andExpect(status().isOk())
				.andDo(print())
				;
	}
}
