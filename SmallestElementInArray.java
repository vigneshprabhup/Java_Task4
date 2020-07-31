package Task4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class SmallestElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Write a Java program to find the second smallest element in an array. 
		
		
Integer[] a= {400,5,2,8,4,3,1,23,4,22,7,6};
		
        HashSet<Integer> h1=new HashSet();
		
        
        
       
		
		for(int i=0;i<a.length;i++)
			h1.add(a[i]);
		
		List<Integer> l1 = new ArrayList(h1);
        
		Collections.sort( l1);
		
		
		 
		
		
		System.out.println("The array without duplicates is :"  +h1);
		
		System.out.println("The sorted array without duplicates is :"  +l1);
		
		System.out.println("The second Smallest number in the array is : " + l1.get(1));
		
		
	}

}
