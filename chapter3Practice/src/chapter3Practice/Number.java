package chapter3Practice;

import java.util.ArrayList;

public class Number {

	public static void main(String[] args)
	{
		int greatestCommonDivisor = 0;
		for(int i=1;i<=495;i++)
		{
			if(1000%i==0 && 495%i==0)
			{
				greatestCommonDivisor =i;
			}
			else
			{
				//do nothing
			}
		}
		System.out.println("1000蛤495程そ计琌" + greatestCommonDivisor);
		
		
		ArrayList<Integer> armstrongNumbers = new ArrayList<Integer>();  //﹚琌String篈
		for(int f=100;f<=999;f++)
		{
			int a = f/100;//a琌κ计
			int b = (f-(a*100))/10;//b琌计
			int c = f-(a*100)-b*10;//c琌计
			int total = (int) (Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3));
			if(f==total)
			{
				armstrongNumbers.add(f);
			}
			else
			{
				//do nothing
			}
		}
		System.out.print("﹊吹Ё计:");
		for(int i=0;i<armstrongNumbers.size();i++)
		{	
			System.out.print(armstrongNumbers.get(i)+"\t");
		}
	}

}
