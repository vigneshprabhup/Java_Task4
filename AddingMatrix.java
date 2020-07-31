package Task4;

import java.util.*;


public class AddingMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan= new Scanner(System.in);
		int row,column;
		System.out.println("Please enter the number of rows for the matrix");
		row = scan.nextInt();
		
		System.out.println("Please enter the number of Columns for the matrix");
		column=scan.nextInt();
		
		int[][] a= new int[row][column];
		int[][] b= new int[row][column];
		int[][] c= new int[row][column];
		
		System.out.println("Please enter the number first  matrix");
		for(int i=0;i<row;i++)
			for(int j=0;j<column;j++)
			{
				a[i][j]=scan.nextInt();
			}
		System.out.println("Please enter the number of second matrix");
		for(int i=0;i<row;i++)
			for(int j=0;j<column;j++)
			{
				b[i][j]=scan.nextInt();
			}
		for(int i=0;i<row;i++)
			for(int j=0;j<column;j++)
			{
				c[i][j]=  a[i][j] + b[i][j];
			}
		System.out.println("The value of the added matrix is : ");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.print(c[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
