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
		System.out.println("1000��495���̤j���]�ƬO" + greatestCommonDivisor);
		
		
		ArrayList<Integer> armstrongNumbers = new ArrayList<Integer>();  //���w�OString�����A
		for(int f=100;f<=999;f++)
		{
			int a = f/100;//a�O�ʦ��
			int b = (f-(a*100))/10;//b�O�Q���
			int c = f-(a*100)-b*10;//c�O�Ӧ��
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
		System.out.print("���i������:");
		for(int i=0;i<armstrongNumbers.size();i++)
		{	
			System.out.print(armstrongNumbers.get(i)+"\t");
		}
	}

}
