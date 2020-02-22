package lab6;


	

	class customException
	{
	    public static void main(String args[])
	    {
	        try
	        {
	            validate();
	        }
	        catch(NoNameException e)
	        {
	            // e.printStackTrace();
	            System.out.println(e);
	        }
	    }

	    static void validate() throws NoNameException
	    {
	        String first = "";
	        String last = "";
	        if(first.equals("") && last.equals(""))
	            throw new NoNameException("No name is specified");
	        else
	            System.out.println("You are allowed " + first + " " + last);

	    }
	}

	class NoNameException extends Exception
	{
	    String msg;
	    
	    NoNameException(String s)
	    {
	        this.msg = s;
	    }

	    @Override
	    public String toString()
	    {
	        return "NoNameException " + this.msg;
	    }
	}

