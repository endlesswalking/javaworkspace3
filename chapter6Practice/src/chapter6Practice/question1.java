package chapter6Practice;

import java.util.Scanner;

public class question1
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		NewArrayList list = new NewArrayList();
		System.out.println("Ready to input,input \"end\" if you want to exit:");
		while(true)
		{
			String userInput = scanner.nextLine();
			if(userInput.equals("end"))
			{
				System.out.println(list.toString());
				break;
			}
			else
			{
				list.add(userInput);
			}
		}
	}
}
