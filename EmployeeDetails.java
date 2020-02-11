package git;


	public class EmployeeDetails {
		int empid;
		String empName;
		float empSal;
		public EmployeeDetails() {

		}
		public EmployeeDetails(int empid,String empName,float empSal) {
		this.empid=empid;
		this.empName=empName;
		this.empSal=empSal;
		}
		public void calculateSalary()
		{
		System.out.println("employee salary"+(empSal+2000));
		}
		public static void main(String[] args) {
		EmployeeDetails ed=new EmployeeDetails();
		ed.calculateSalary();
		}

		}
