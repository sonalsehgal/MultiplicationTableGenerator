package day6;

import java.util.Scanner;

public class MultiplicationTableGenerator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number to print its multiplication table.");
		
		int num = scanner.nextInt();
		System.out.println("Multiplication table for "+num+ ":");
		for(int i=1; i<=10; i++)
		{
			int result = num*i; 
			//System.out.println(result);
			System.out.println(num + " x " +i+ " = " +result);
		}

	}

}
