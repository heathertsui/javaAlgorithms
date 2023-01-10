package dataTypesModule2;
import java.util.Arrays;

public class module2 {

	public static void main(String[] args) {
		String names[] = { "jack", "jill", "bill", "murray", "tom" };
		Arrays.sort(names);
		System.out.println(names.length);
		System.out.println(names[0] + "\n" + names[1]  + "\n" + names[2]  + "\n" + names[3]  + "\n" + names[4]);
	//	System.out.println(names.replace("tom", "yuk"));
		System.out.println(names[0]);
		System.out.println(names[4]);
	}

}
