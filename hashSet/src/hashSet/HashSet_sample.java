package hashSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HashSet_sample
{
	public static HashSet getSet(String input)
	{
		String[] splitInput = input.split(" ");
		return new HashSet(Arrays.asList(splitInput));
	}
	
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		String userInput = scanner.nextLine();
		Set words = HashSet_sample.getSet(userInput);
		System.out.printf("�����Ƴ�r��%d�� : %s%n",words.size(),words);
	}

}
