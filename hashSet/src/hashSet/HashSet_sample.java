package hashSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class HashSet_sample
{
	public static HashSet getSet(String input)
	{
		String[] splitInput = input.split(" ");
		List list  = Arrays.asList(splitInput);
		return new HashSet(list);
	}
	
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		String userInput = scanner.nextLine();
		Set words = HashSet_sample.getSet(userInput);
		System.out.printf("不重複單字有%d個 : %s%n",words.size(),words);
	}

}
