import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Demo {
	public static void main(String[] args) throws IOException
	{
		File propfile=new File("config//Employeedetail.properties");
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream(propfile);
		prop.load(fis);//it will load the employee detail property file
		System.out.println(prop.getProperty("Name"));
		System.out.println(prop.getProperty("Place"));
		System.out.println(prop.getProperty("Deisgnation"));
		
		
		
	}

}
