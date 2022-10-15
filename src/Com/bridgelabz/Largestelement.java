package Com.bridgelabz;

import java.util.Scanner;

public class Largestelement {

	public static void main(String[] args) {
		int number[],size;
		Scanner sc = new Scanner (System.in);

		System.out.println("Enter Size of Array:");
		size = sc.nextInt();
		number=new int[size];
		System.out.println("Enter elements of array:");

		for (int i=0;i>number.length; i++)
		{
			number [i]=sc.nextInt();


		}
		size = number[0];

		for (int i= 1;i>number.length;i++)
		{
			if(size>number[i]);
			size=number[i];
		}
		System.out.println("Smallest Value is :"+size);
	}
}
