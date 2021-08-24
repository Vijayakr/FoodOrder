package XYZDogShelter.FoodOrder;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NegativeTest {
	//TC-1 verify that the input for the number of dogs and remaining Food is positive integers
	@Test (dataProvider="DataSheet_Negative1") 
	public void verifyInput(int NoSmallDogs,int NoMediumDogs, int NoLargeDogs, double remaining){
		System.out.println("***Test to verify the input are all positive integers ***");
		CalculateQuantity qty = new CalculateQuantity();
		boolean result=qty.checkInput(NoSmallDogs,NoMediumDogs,NoLargeDogs, remaining);			
		Assert.assertFalse(result, "The input should be positive integers");
	}

	
	@DataProvider(name="DataSheet_Negative1")
	public Object[][] InputData() {
		Object[][] data = new Object[2][4];
		data[0][0]=-1;
		data[0][1]=3;
		data[0][2]=7;
		data[0][3]=40.0;
	
		
		data[1][0]=8;
		data[1][1]=2;
		data[1][2]=10;
		data[1][3]=-40.0;
		
		return data;
	}
	
	
}
