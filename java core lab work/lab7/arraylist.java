package lab7;

	import java.util.ArrayList;
	import java.util.Collections;

	public class arraylist  {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			ArrayList<String> arr1=new ArrayList<String>();
			arr1.add(0, "hp");
			arr1.add(1, "lenovo");
			arr1.add(2, "dell");
			arr1.add(3, "acer");
		//	System.out.println(arr1.get(2));
			//System.out.println(arr1.size());

			Collections.sort(arr1);
			//System.out.println(arr1);

			for(String element:arr1)
			{
				System.out.println(element);
			}
		}

	}

