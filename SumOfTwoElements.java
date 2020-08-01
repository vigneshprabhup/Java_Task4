package Task4;


import java.util.*;

public class SumOfTwoElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Write a Java program to find the sum of the two elements of a given array which is equal to a given integer.

h. Sample array: [1,2,4,5,6]

i. Target value: 6*/
		
		Scanner scan=new Scanner(System.in);
		
		Integer[] a= {1,2,4,5,6};
		
		System.out.println("Please enter the Value to check");
        
		int value = scan.nextInt();
         
         for(int i=0;i<a.length-1;i++)
        	 for(int j=1;j<a.length;j++)
         {
        	 if(a[i]+a[j]== value)
        		 System.out.println(a[i] + "\t" + a[j]);
         }
	}

}
