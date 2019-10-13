
import java.util.List;
import java.util.Arrays;

public class ArrayClassBasics {
//	There are often times when loops are used to do some tasks on an array like:
//
//		1.Fill an array with a particular value.
//		2.Sort an Arrays.
//		3.Search in an Arrays.
//		4.And many more.
//		Arrays class provides several static methods that can be used to perform these tasks directly without the use of loops.
	public static void main(String[] args) {
		int[] arr = new int[] { 23, 45, 10, 98, 65 };

		int[] newArr = Arrays.copyOf(arr, 7);
		newArr[5] = 20;// array is fixed size so by copyof method we can copy old array
		newArr[6] = 52;// and increase size of array thats is very complex everytime to increase
		// so list and ArrayList come in picture which is not fixed size it can
		// dynamically increase the size
		for (int i = 0; i < newArr.length; i++) {
			System.out.println(newArr[i]);

		}
		//List is the interface and ArrayList is the concrete class
		// Java program to demonstrate //asList() converts array into arrayList.
		// asList() method for String value 
		String[] strArr=new String[] {"a","b","c","d","e"};
		List<String> strlist = Arrays.asList(strArr); 
		System.out.println("printing arrayList"+strlist);
		
		
		//asList() for Integer values
		Integer[] intArr=new Integer[] {2,6,7};//Arrays shoulbe same dataype
		List<Integer> list  = Arrays.asList(intArr);//here array intarr is of type Integer
		//so list is also Integer type
		
		
		
		Arrays.sort(newArr);
		System.out.println("sorted array");
		for (int i = 0; i < newArr.length; i++) {
			System.out.println(newArr[i]);

		}
     
	}

}
