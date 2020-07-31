package test;

import java.util.*;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan =  new Scanner(System.in);
		int[] a= {1,2,3,4,2,5,1,6,4,5,5,2,2,1};
		
		//String str= a.toString();
		HashSet<Integer> h1=new HashSet();
		
		
		for(int i=0;i<a.length;i++)
			h1.add(a[i]);
		
		
		System.out.println(h1);
		
	

	}

}
