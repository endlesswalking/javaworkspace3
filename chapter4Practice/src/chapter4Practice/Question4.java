package chapter4Practice;

public class Question4
{

	public static void main(String[] args)
	{
		int[] number = {70,80,31,37,10,1,48,60,33,80};
		for(int i=number.length-1;i>=0;i--)
		{
			for(int j=0;j<=i-1;j++)
			{
				int a = 0;
				if(number[j+1]<number[j])
				{
					a = number[j];
					number[j] = number[j+1];
					number[j+1] = a;
				}
				else
				{
					//do nothing
				}
			}
		}
		for(int i=0;i<number.length;i++)
		{
			System.out.print(number[i] + ",");
		}
	}

}
