package XYZDogShelter.FoodOrder;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Base {
	public int smallFood;
	public int mediumFood;
	public int largeFood;
	public double extraPercent;
	public int maxDogs;
	public double minPercent;
	public int intitializeSmallFood() throws IOException{
		// data.properties is defined to retrieve the constants value
		//Loading the properties file
		Properties prop=new Properties();
		FileInputStream fis =new FileInputStream("/Users/reshmivijayakumaran/Downloads/SELENIUM/Project/FoodOrder/src/main/java/data.properties");
		prop.load(fis);
		// initialize the value from the properties file
		smallFood=Integer.parseInt(prop.getProperty("smallFood"));		
		return smallFood;
	}
	public int intitializeMediumFood() throws IOException{
		// data.properties is defined to retrieve the constants value
		//Loading the properties file
		Properties prop=new Properties();
		FileInputStream fis =new FileInputStream("/Users/reshmivijayakumaran/Downloads/SELENIUM/Project/OrderFood/src/main/java/data.properties");
		prop.load(fis);
		// initialize the value from the properties file
		mediumFood=Integer.parseInt(prop.getProperty("mediumFood"));		
		return mediumFood;
	}
	public int intitializeLargeFood() throws IOException{
		// data.properties is defined to retrieve the constants value
		//Loading the properties file
		Properties prop=new Properties();
		FileInputStream fis =new FileInputStream("/Users/reshmivijayakumaran/Downloads/SELENIUM/Project/OrderFood/src/main/java/data.properties");
		prop.load(fis);
		// initialize the value from the properties file
		largeFood=Integer.parseInt(prop.getProperty("largeFood"));		
		return largeFood;
	}
	public double intitializeExptraPercent() throws IOException{
		// data.properties is defined to retrieve the constants value
		//Loading the properties file
		Properties prop=new Properties();
		FileInputStream fis =new FileInputStream("/Users/reshmivijayakumaran/Downloads/SELENIUM/Project/OrderFood/src/main/java/data.properties");
		prop.load(fis);
		// initialize the value from the properties file
		extraPercent=Double.parseDouble(prop.getProperty("extraPercent"));		
		return extraPercent;
	}
	public int intitializeMaxDogs() throws IOException{
		// data.properties is defined to retrieve the constants value
		//Loading the properties file
		Properties prop=new Properties();
		FileInputStream fis =new FileInputStream("/Users/reshmivijayakumaran/Downloads/SELENIUM/Project/OrderFood/src/main/java/data.properties");
		prop.load(fis);
		// initialize the value from the properties file
		maxDogs=Integer.parseInt(prop.getProperty("maxDogs"));		
		return maxDogs;
	}
	public double intitializeMinPercent() throws IOException{
		// data.properties is defined to retrieve the constants value
		//Loading the properties file
		Properties prop=new Properties();
		FileInputStream fis =new FileInputStream("/Users/reshmivijayakumaran/Downloads/SELENIUM/Project/OrderFood/src/main/java/data.properties");
		prop.load(fis);
		// initialize the value from the properties file
		minPercent=Double.parseDouble(prop.getProperty("MinPercent"));		
		return minPercent;
	}
}


  