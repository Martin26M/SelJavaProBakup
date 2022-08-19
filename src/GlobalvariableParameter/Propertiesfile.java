package GlobalvariableParameter;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Propertiesfile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream ("C:\\Users\\HP\\eclipse-workspace\\SelJava\\src\\GlobalvariableParameter\\data.properties");

		
		prop.load(fis);
		prop.getProperty("browser");
		System.out.println(prop.getProperty("browser"));
}}