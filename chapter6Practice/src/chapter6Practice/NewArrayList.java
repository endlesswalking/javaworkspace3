package chapter6Practice;

import java.util.ArrayList;

public class NewArrayList extends ArrayList
{
	@Override
	public String toString()
	{
		String result = "";
		for(int i=0;i<this.size();i++)
		{
			result = result + super.get(i).toString();
		}
		return result;
	}
}
