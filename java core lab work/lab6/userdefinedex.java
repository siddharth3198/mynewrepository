package lab6;


	class InvalidAgeException extends Exception{  
		 InvalidAgeException(String s){  

		 }  
		}  
	public class userdefinedex{  
		    static void validate(int age) throws InvalidAgeException {  
		     if(age<18)  
		      throw new InvalidAgeException("not valid");  
		     else  
		      System.out.println("valid age");  
		   }  
		   public static void main(String args[]){  
		      try {
				validate(12);
		      } catch(Exception e) {
		    	  
		      }
			 
			}  
		     
		  }
		 


