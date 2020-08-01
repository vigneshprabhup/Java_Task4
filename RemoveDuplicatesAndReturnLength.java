package Task4;

import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicatesAndReturnLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Write a Java program to remove the duplicate elements of a given array and return the new length of the array.*/

		Scanner scan =  new Scanner(System.in);
		int[] a= {1,2,3,4,2,5,1,6,4,5,5,2,2,1};
		
		
		HashSet<Integer> h1=new HashSet();
		
		
		for(int i=0;i<a.length;i++)
			h1.add(a[i]);
		
		
		
		System.out.println(h1.size());
	}

}
