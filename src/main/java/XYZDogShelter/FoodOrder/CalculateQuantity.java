package XYZDogShelter.FoodOrder;

import java.io.IOException;



public class CalculateQuantity extends Base{
	public int smallFood;
	public int mediumFood;
	public int largeFood;
	public double extraPercent;
	public int maxDogs;
	public double minPercent;
	
	Base b=new Base();

	//verify that the input is all positive integers
	public boolean checkInput(int NoSmallDogs, int NoMediumDogs, int NoLargeDogs, double remaining) {
		if ((NoSmallDogs >=0) && (NoMediumDogs >=0) && (NoLargeDogs >=0) && (remaining >=0.0)){
			return true;
		}
		return false;
	}
	
	//verify that the extra buffer is at least20%
	public boolean checkMinPCT(double extraPercent) throws IOException {
		minPercent=b.intitializeMinPercent();
		if ((extraPercent >= minPercent)){
			return true;
		}
		return false;
	}
	
	//verify that total number of dogs
	public int totalDogs(int smallDogs, int mediumDogs, int largeDogs) {
		System.out.println("***Test to verify the total number of dogs***");
		return smallDogs + mediumDogs + largeDogs;
	}
	
	//verify the calculations for the food order
	public double Quantity(int smallDogs, int mediumDogs, int largeDogs, double remainFood) throws IOException {
		System.out.println("***Test to verify the calculation for food order***");
		
		// initialize the value from the base class
		smallFood=b.intitializeSmallFood();
		mediumFood=b.intitializeMediumFood();
		largeFood=b.intitializeLargeFood();
		extraPercent=(b.intitializeExptraPercent())/100;
		
		//Calculate the food to order based on size of dogs
		int minFoodNeeded= smallDogs*b.smallFood+ mediumDogs*b.mediumFood+ largeDogs*b.largeFood;
		//System.out.println("Minimum Food needed = "+minFoodNeeded);
				
		//food including from last month
		double totalFood=minFoodNeeded - remainFood;
		//System.out.println("Total Food = "+totalFood);
				
		//extra 20% of food to order
		double foodBuffer=totalFood*extraPercent;
		//System.out.println("Food buffer = "+foodBuffer);
			
		//Calculate food to order
		double totalOrder= totalFood+foodBuffer;
		System.out.println("Total Order = "+totalOrder);
		
		if (totalOrder< 0)
			return 0;
		else
			return totalOrder;
	}

}
