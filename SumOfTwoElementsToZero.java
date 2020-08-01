package Task4;

import java.util.Scanner;

public class SumOfTwoElementsToZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		Scanner scan=new Scanner(System.in);
		
		Integer[] a= {1,2,4,5,6,-2,-4,-1,4,5,-3,-2};
		
		System.out.println("Please enter the Value to check");
        
		
         
         for(int i=0;i<a.length-1;i++)
        	 for(int j=1;j<a.length;j++)
         {
        	 if(a[i]+a[j]== 0)
        		 System.out.println("\t" + a[i] + "\t" + a[j]);
         }

	}

}
