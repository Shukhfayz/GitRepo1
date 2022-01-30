package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileReader {

	public static Properties prop;
	public static FileInputStream fis;
	
	
	public static void readProperties() {

	try {
		prop = new Properties();
		fis = new FileInputStream("src\\test\\resources\\properties\\data.properties");
		prop.load(fis);
	} catch (FileNotFoundException e1) {
		e1.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	}
}
