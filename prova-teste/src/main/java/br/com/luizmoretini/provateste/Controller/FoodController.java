package br.com.luizmoretini.provateste.Controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import br.com.luizmoretini.provateste.Models.Food;

@Controller
public class FoodController {

	private final List<Food> listDefaultFoods = generateFoods();

	@GetMapping("/")
	public String listFoods(Model model) {
		model.addAttribute("comidas", listDefaultFoods);
		return "comidas";
	}
	
	private List<Food> generateFoods() {
		List<Food> listFood = new ArrayList<Food>();
		Food firstFood = new Food("Lasanha", 3.65, 200, "Queijo", "Italiana");
		Food secondFood = new Food("Macarrão", 5.65, 350, "Tomate", "Italiana");
		listFood.add(firstFood);
		listFood.add(secondFood);
		return listFood;
	}

}
