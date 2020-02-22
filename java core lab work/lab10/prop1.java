package lab10;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class prop1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
 Properties p1=new Properties();
 FileReader reader=new FileReader("info.properties");  
 p1.load(reader);
  System.out.println(p1.getProperty("name"));
	}

}
