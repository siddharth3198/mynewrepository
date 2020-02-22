package lab6;


	import java.util.Scanner;

	public class employeeException extends Exception {
		employeeException(String s){
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			Scanner sc =new Scanner(System.in);
			System.out.println("enter sal:");
			int empsal=sc.nextInt();
			System.out.println("enter empsal:"+empsal);
			try {
				if (empsal<3000)
					throw new employeeException(" sal is less than excepted");
				else {
					System.out.println("valid sal");
				}
			} 
			catch(employeeException e)
			{
				System.out.println(e);
				System.out.println("expected high sal");

			}
		}
	}
