package chapter9Practice;

import java.util.Scanner;

public class Question1
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("�п�J:");
		String userInput = scanner.nextLine();
		String[] tokens = userInput.split(" ");
		for(String string:tokens)
		{
			IterableString iterableString = new IterableString(string);
			iterableString.splitIntoCharsAndOutput();;
		}
	}

}
