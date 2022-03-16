package Controller;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import Models.Food;

@Controller
public class FoodController {
	
	
	private List<Food> listDefaultFoods = generateFoods();
	
	@GetMapping("/listFoods")
	public List<Food> listFoods() {
		
		return listDefaultFoods;
	}
	
	@PostMapping("/includeFood")
	public String includeFood(Food food ) {
		listDefaultFoods.add(food);
		
		return "Comida incluída com sucesso";
	}
	
	private List<Food> generateFoods() {
		List<Food> listFood = new ArrayList<Food>();
		
		Food firstFood = new Food(1, "Lasanha", 3.65, 200, "Queijo", "Italiana");
		Food secondFood = new Food(1, "Macarrão", 5.65, 350, "Tomate", "Italiana");
		
		listFood.add(firstFood);
		listFood.add(secondFood);
		
		return listFood;
	}

}
