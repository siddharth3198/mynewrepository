package lab10;

import java.io.File;
import java.util.*;  
import java.io.*;  
public class prop {


	
		public static void main(String[] args)throws Exception{  
		  
		Properties p=new Properties();  
		p.setProperty("name","Sonoo Jaiswal");  
		p.setProperty("email","sonoojaiswal@javatpoint.com");  
		  
		p.store(new FileWriter("info.properties"),"Javatpoint Properties Example");  
		  
		}  
		  
	}

