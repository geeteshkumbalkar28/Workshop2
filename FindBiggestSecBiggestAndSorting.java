/*Write a program to find FIRST BIGGEST AND SECOND BIGGEST ELEMENT  elements in
given array?
without sorting and with sortnng*/

import java.util.*;

public class FindBiggestSecBiggestAndSorting
{
	int arr[];
	public static void main(String arg[])
	{
		Scanner scan = new Scanner(System.in);
		FindBiggestSecBiggestAndSorting findBiggestSecBiggestAndSorting = new FindBiggestSecBiggestAndSorting();
		
		System.out.println("Enetr the Array size");
		int size = scan.nextInt();
		findBiggestSecBiggestAndSorting.accept(size);
	
		int largestNumber=findBiggestSecBiggestAndSorting.findBiggestElement(size);
		System.out.println(" BIGGEST  number is :"+largestNumber);
		
		int secondLargestNumber=findBiggestSecBiggestAndSorting.findSecondBiggestElement(size);
		System.out.println(" Second Biggest  number is :"+secondLargestNumber);
		
		System.out.println("Array before sorting");
		findBiggestSecBiggestAndSorting.display(size);
		findBiggestSecBiggestAndSorting.sort(size);
		
		System.out.println("Array after sorting");
		findBiggestSecBiggestAndSorting.display(size);
	}
	public void sort(int arrSize)
	{
		
		for(int counter=0;counter<arrSize;counter++)
		{
			for(int counter2 = counter+1; counter2<arrSize;counter2++)
			{
				int temp=0;
				if(arr[counter]>arr[counter2])
				{
					temp =arr[counter];
					arr[counter]=arr[counter2];
					arr[counter2]=temp;
					
				}
			}
		}
	}
	public int findBiggestElement(int arrSize)
	{
			int max=arr[0]; // 1 5 6 9 7
		for(int counter=1; counter<arrSize;counter++)
		{
			if(arr[counter] > max )
			{
				max = arr[counter];
			}
		}
		return max;
	}
	public int findSecondBiggestElement(int arrSize)
	{
			int max=findBiggestElement(arrSize);
			int secMax=arr[0];
			
		for(int counter=1; counter<arrSize;counter++)
		{
			if((arr[counter] > secMax)&&(arr[counter] < max))
			{
				secMax = arr[counter];
			}
		}
		return secMax;
	}
	public void accept(int arrSize)
	{
		Scanner scan = new Scanner(System.in);
		arr= new int[arrSize];
		System.out.println("Eneter the elements");
		for(int counter=0; counter<arrSize;counter++)
		{
			arr[counter] = scan.nextInt();
		}
	}
	public void display(int arrSize)
	{
		for(int counter=0; counter<arrSize;counter++)
		{
			System.out.println(arr[counter]);
		}
	}
	
	
}
