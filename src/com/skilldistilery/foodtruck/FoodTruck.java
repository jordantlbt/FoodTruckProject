package com.skilldistilery.foodtruck;

public class FoodTruck {

	// only keeps data from foodTruckApp
	// name, food, rating
	// food truck id will be generated
	// will need a toString method

	private static int foodTruckCounter = 0;
	private int id;
	private String foodTruckName;
	private String foodTruckType;
	private int foodTruckRating;

	public FoodTruck(String foodTruckName, String foodTruckType, int foodTruckRating) {

		this.foodTruckName = foodTruckName;
		this.foodTruckType = foodTruckType;
		this.foodTruckRating = foodTruckRating;
		this.id = foodTruckCounter++;

	}

	public int getFoodTruckCounter() {
		return foodTruckCounter;
	}

	public void setNumberOfTrucks(int foodTruckCounter) {
		this.foodTruckCounter = foodTruckCounter;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFoodTruckName() {
		return foodTruckName;
	}

	public void setFoodTruckName(String foodTruckName) {
		this.foodTruckName = foodTruckName;
	}

	public String getFoodTruckType() {
		return foodTruckType;
	}

	public void setFoodTruckType(String foodTruckType) {
		this.foodTruckType = foodTruckType;
	}

	public double getFoodTruckRating() {
		return foodTruckRating;
	}

	public void setFoodTruckRating(int foodTruckRating) {
		this.foodTruckRating = foodTruckRating;
	}

	@Override
	public String toString() {
		return "FoodTruck [foodTruckName=" + foodTruckName + ", foodTruckType=" + foodTruckType + ", foodTruckRating="
				+ foodTruckRating + "]";
	}

}
