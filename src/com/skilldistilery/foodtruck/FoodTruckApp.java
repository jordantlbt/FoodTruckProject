package com.skilldistilery.foodtruck;

import java.util.Scanner;
import java.util.Arrays;

public class FoodTruckApp {

	static Scanner userInput = new Scanner(System.in);
	static FoodTruck[] foodTrucks = new FoodTruck[5];

	// only class with a scanner
	// only class with scanner
	// will prompt user until user types quit then input ends and menu pop ups
	// then a looping menu will continue until user chooses quit option

	public static void main(String[] args) {


		// used to call non static methods

		// loop the questions and scanner while user inputs info
		FoodTruckApp ft = new FoodTruckApp();
		for (int i = 0; i < 5; i++) {

			System.out.print("Please enter the name of a food truck: ");
			String foodTruckName = userInput.nextLine();

			if (foodTruckName.equals("Quit")) {
				break;
			}

			System.out.print("Please enter the type of food the food trucks serves: ");
			String foodTruckType = userInput.nextLine();

			System.out.print("Please rate the food truck bewtween 1-5: ");
			int foodTruckRating = userInput.nextInt();
			userInput.nextLine();
			System.out.println();

			// String truckInfo = "Name of the food truck: " +foodTruckName + "Type of food:
			// " + foodTruckType + "Rating of Food truck: " + foodTruckRating;
			// System.out.println(i + internals);

			foodTrucks[i] = new FoodTruck(foodTruckName, foodTruckType, foodTruckRating);
			// foodTrucks[count] = foodTruck;

		}
		ft.menuChoices(foodTrucks);

	}

	// the options for the menu the user can select and the println results
	public void menuChoices(FoodTruck[] foodTrucks) {

		boolean keepGoing = true;

		while (keepGoing) {

			printMenu();
			int choice = userInput.nextInt();
			switch (choice) {
			case 1: // all food truck names except for null
				System.out.println();
				System.out.println();
				break;
			case 2: // average rating for the trucks
				System.out.println(averageRating(foodTrucks));
				break;
			case 3: // highest rated food truck
				System.out.println();
				break;
			case 4: // exit
				System.out.println("Now exiting program....");
				keepGoing = false;
				break;
			default:
				System.out.println("Please enter a number between 1 - 4");
				System.out.println("");
				break;

			}

		}

	}

	public void printMenu() {

		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Please choose an option:");
		System.out.println("");
		System.out.println("1. List of all food trucks");
		System.out.println("2. Average rating of food trucks");
		System.out.println("3. Highest-rated food truck");
		System.out.println("4. Quit");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

	}

	// adding all food truck ratings and divide them to find average
	public double averageRating(FoodTruck[] foodTrucks) {

		int total = 0;
		int numTrucks = 0;
		for (int i = 0; i < foodTrucks.length; i++) {

			if (foodTrucks[i] != null) {
				numTrucks++;
				total = (int) (total + foodTrucks[i].getFoodTruckRating());
			}
		}

		double average = total / numTrucks;

		return average;

	}

	// sort all the food truck ratings to find the highest rating
	public int highestRating(FoodTruck[] foodTrucks) {

		int size = foodTrucks.length;
		Arrays.sort(foodTrucks);
		int highest = size - 1;

		return highest;
	}

}
