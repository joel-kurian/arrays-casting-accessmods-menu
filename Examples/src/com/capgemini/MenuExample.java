package com.capgemini;

import java.util.Scanner;

public class MenuExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		loop:while (true) {
			System.out.println("1. Add\n2. Sub\n3. Mul\n4. Div\n5. Exit");
			int choice = sc.nextInt();
			int num1;
			int num2;
			switch(choice) {
			case 1:
				System.out.println("Enter 2 numbers:");
				num1 = sc.nextInt();
				num2 = sc.nextInt();
				System.out.println(num1 + "+" + num2 + "=" + (num1+num2));
				break;
			case 2:
				System.out.println("Enter 2 numbers:");
				num1 = sc.nextInt();
				num2 = sc.nextInt();
				System.out.println(num1 + "-" + num2 + "=" + (num1-num2));
				break;
			case 3:
				System.out.println("Enter 2 numbers:");
				num1 = sc.nextInt();
				num2 = sc.nextInt();
				System.out.println(num1 + "*" + num2 + "=" + (num1*num2));
				break;
			case 4:
				System.out.println("Enter 2 numbers:");
				num1 = sc.nextInt();
				num2 = sc.nextInt();
				System.out.println(num1 + "/" + num2 + "=" + ((double)num1/num2));
				break;
			case 5:
				break loop;
			default:
				System.out.println("please make a valid selection");
			}
		}
		sc.close();
	}

}
