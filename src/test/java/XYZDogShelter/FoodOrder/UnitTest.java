package XYZDogShelter.FoodOrder;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UnitTest {
	//This test is to verify the total number of animals
		@Test
		public void testSum() {
			CalculateQuantity qty = new CalculateQuantity();
			int DogsCount = qty.totalDogs(5,3,7);
			Assert.assertEquals(DogsCount, 15);
		}
		
		//This test to verify the calculation required to order food for the shelter
		@Test
		public void testQuantity() throws IOException {
			CalculateQuantity qty = new CalculateQuantity();
			double OrderQty = qty.Quantity(5,3,7,17) ;
			Assert.assertEquals(OrderQty, 363.6);
			
		}
		
}
