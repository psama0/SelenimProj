import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	

	public static void main(String[] args) throws IOException {
		
		File propfile=new File("config//ProjectDetails.properties");	
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream(propfile);
		prop.load(fis);
         
        	 System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
        	 WebDriver driver= new ChromeDriver();
        	  driver.manage().window().maximize();
         
         
         driver.get(prop.getProperty("URL"));
         
         
		
	}
}
	

