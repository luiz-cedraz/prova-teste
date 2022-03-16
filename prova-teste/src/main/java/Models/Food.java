package Models;

public class Food {
	
	public int id;
	public String name;
	public double averageWeight;
	public int calorie;
	public String principalIngredient;
	public String nationality;
	
	
	public Food(int id, String name, double averageWeight, int calorie, String principalIngredient,
			String nationality) {
		super();
		this.id = id;
		this.name = name;
		this.averageWeight = averageWeight;
		this.calorie = calorie;
		this.principalIngredient = principalIngredient;
		this.nationality = nationality;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getAverageWeight() {
		return averageWeight;
	}


	public void setAverageWeight(double averageWeight) {
		this.averageWeight = averageWeight;
	}


	public int getCalorie() {
		return calorie;
	}


	public void setCalorie(int calorie) {
		this.calorie = calorie;
	}


	public String getPrincipalIngredient() {
		return principalIngredient;
	}


	public void setPrincipalIngredient(String principalIngredient) {
		this.principalIngredient = principalIngredient;
	}


	public String getNationality() {
		return nationality;
	}


	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
}
