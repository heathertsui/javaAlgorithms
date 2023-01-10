package dataTypesModule2;
import java.util.ArrayList;
import java.util.Collections;

public class salaries {

	public static void main(String[] args) 
	{
			
		ArrayList<Integer> salaries = new ArrayList<Integer>();
		salaries.add(75000);
		salaries.add(25000);
		salaries.add(42000);
		salaries.add(30000);
		salaries.add(55000);
		salaries.add(42000);
		salaries.add(39000);
		
		System.out.println(Collections.max(salaries));
		System.out.println(Collections.min(salaries));
		System.out.println(salaries.indexOf(42000));
		Collections.sort(salaries);
		System.out.println(salaries.get(4));
		System.out.println("before revsere" + salaries);
		Collections.reverse(salaries);
		System.out.println("after reverse" + salaries);
		System.out.println(salaries.get(0));					//first item
		System.out.println(salaries.get(salaries.size() - 1));	//last item
	}

}
