package lab10;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;

public class prop2 {

	public static void main(String[] args)throws Exception{  
Properties p2=new Properties();
FileReader f=new FileReader("C:/Users/siddh/workspace5/lab10/src/lab10/in.properties");

p2.load(f);
System.out.println(p2.getProperty("name"));
}
}
