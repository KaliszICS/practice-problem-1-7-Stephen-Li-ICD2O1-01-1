/**
File: Lesson 1.7 - Booleans (and, or, not)
Author: Stephen li
Date Created: Feb 23, 2026
Date Last Modified: Feb 23, 2026
*/

import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
	}

	public static void q1() {
		boolean bool1 = true;
		boolean bool2 = false;
		System.out.println(bool1 && bool2);
		System.out.println(bool1 || bool2);
	}

	public static void q2() {
		Scanner input = new Scanner(System.in);
		System.out.print("Input a lowercase letter: ");
		String word1 = input.nextLine();
		char char1 = word1.charAt(0);
		System.out.print("Input another lowercase letter: ");
		String word2 = input.nextLine();
		char char2 = word2.charAt(0);
		System.out.println(char1 < char2);
	}

	public static void q3() {
		Scanner input = new Scanner(System.in);
		System.out.print("Input a number: ");
		double num1 = input.nextDouble();
		System.out.println((num1 >= 0) && (num1 <= 10));
	}

	public static void q4() {
		Scanner input = new Scanner(System.in);
		System.out.print("Input a number: ");
		double num1 = input.nextDouble();
		System.out.println((num1 > 0) && (num1 != 5));
	}

	public static void q5() {
		Scanner input = new Scanner(System.in);
		System.out.print("Input a word: ");
		String word1 = input.nextLine();
		System.out.println(word1.compareTo("banana") != 0);
	}

	public static void q6() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int num1 = input.nextInt();
		System.out.println("The integer " + num1 + " is " + (num1 % 2 == 0));
	}

}
