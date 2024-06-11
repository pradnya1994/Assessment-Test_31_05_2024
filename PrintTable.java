package assignment31_05_2024;

import java.util.Scanner;

public class PrintTable {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int number;
		System.out.println("Enter the number : ");
		number = scanner.nextInt();
		scanner.close();

		for(int i=1; i<=10 ; i++)
		{
			System.out.println(number+"*"+i+"=" +number*i);
		}

	}

}
