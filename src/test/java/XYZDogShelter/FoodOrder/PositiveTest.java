package XYZDogShelter.FoodOrder;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PositiveTest {
	//TC-1 verify that the Total number of dogs in the shelter should not exceed 30
		@Test (dataProvider="DataSheet_Positive") 
		public void verifyTotalDogs(int NoSmallDogs,int NoMediumDogs, int NoLargeDogs, double remaining, double expected) {
			System.out.println("***Test to verify the total number of dogs not exceed 30 ***");
			CalculateQuantity qty = new CalculateQuantity();
			//System.out.println(NoSmallDogs);
			//System.out.println(NoMediumDogs);
			//System.out.println(NoLargeDogs);
			int DogsCount = qty.totalDogs(NoSmallDogs,NoMediumDogs,NoMediumDogs);
			if (DogsCount >= 30) {   
				Assert.assertTrue(false,"Shelter can hold atmost 30 dogs");
			}
			Assert.assertTrue(true);	
		}
		
		//TC-2 verify that when ordering food you always want to order at least 20% more
		@Test
		public void verifyExtraPCT() throws IOException {
			System.out.println("***Test to verify the extra buffer is atleast 20% ***");
			CalculateQuantity qty = new CalculateQuantity();
			boolean pctChk=qty.checkMinPCT(20.0);
			Assert.assertTrue(pctChk, "Extra buffer while ordering food should atleast be 20%");
		}
		
		
		//TC-3 verify the calculation to order food
			@Test (dataProvider="DataSheet_Positive") 
			public void verifyCalculation(int NoSmallDogs,int NoMediumDogs, int NoLargeDogs, double remaining, double expected) throws IOException{
				System.out.println("***Test to verify the calculation to order food ***");
				CalculateQuantity qty = new CalculateQuantity();
				double total=qty.Quantity(NoSmallDogs,NoMediumDogs,NoLargeDogs, remaining);
				System.out.println("total="+total);
				System.out.println("expected="+expected);
				Assert.assertEquals(total, expected);
			}
		
		
		@DataProvider(name="DataSheet_Positive")
		public Object[][] InputData() {
			Object[][] data = new Object[5][5];
			data[0][0]=5;
			data[0][1]=3;
			data[0][2]=7;
			data[0][3]=40.0;
			data[0][4]=336.0;
			
			data[1][0]=8;
			data[1][1]=2;
			data[1][2]=10;
			data[1][3]=50.0;
			data[1][4]=444;
			
			data[2][0]=15;
			data[2][1]=2;
			data[2][2]=10;
			data[2][3]=56.3;
			data[2][4]=520.44;
			
		//edge case where you will not need to order anything	totalOrder is 0
			data[3][0]=2;
			data[3][1]=2;
			data[3][2]=2;
			data[3][3]=120.0;
			data[3][4]=0.0;
			
		//edge case where totalOrder will be less than 0 and in this case should return 0	
			data[4][0]=2;
			data[4][1]=2;
			data[4][2]=2;
			data[4][3]=130.0;
			data[4][4]=0.0;
			
			return data;
			
		}
}
