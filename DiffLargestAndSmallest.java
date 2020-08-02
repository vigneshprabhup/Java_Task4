package Task4;

public class DiffLargestAndSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*18. Write a Java program to get the difference between the largest and smallest values in an array of integers.
		 *  The length of the array must be 1 and above.*/

		int[] a= {1,2,3,4,2,555,1,6,4,5,5,2,2,1,33,5,66};
		int min,max;
		min = a[0];
		max=a[a.length-1];
		
//		System.out.println("The minimum element is :" +min);
//		System.out.println("The minimum element is :" +min);
//		
//		for(int i=0;i<(a.length);i++)
//		{
//			for(int j=1;j<(a.length-1);j++)
//		{
//			if(a[i]<a[j])
//			{
//				min=a[i];
//				System.out.println(" minimum   :" + min);
//			}
//			if(a[i]>a[j])
//			{
//				max=a[i];
//				System.out.println(" Maximum   :" + max);
//			}
//		}
//		}
		
		
		for(int i=0;i<(a.length);i++)
		{
			if(a[i]< min)
				min=a[i];
			if(a[i]>max)
				max=a[i];
		}
		
		System.out.println("The minimum element is :" + min);
		System.out.println("The Maximum element is :" + max); // the difference is missing
	}

}
