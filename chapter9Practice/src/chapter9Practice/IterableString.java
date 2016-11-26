package chapter9Practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;



public class IterableString
{
	String string;
	ArrayList list = new ArrayList();
	IterableString(String string)
	{
		this.string = string;
	}
	
	public void outputChars(Collection collection)
	{
		Iterator iterator = collection.iterator();
		while(iterator.hasNext())
		{
			System.out.print(iterator.next()+"\t");
		}
		System.out.println("\n");
	}
	
	public void splitIntoCharsAndOutput()
	{
		//�N�r����Φ��@�ӭӦr���A��ilist
		for(int i=0;i<this.string.length();i++)
		{
			String a = this.string.substring(i, i+1);
			list.add(a);
		}
		this.outputChars(this.list);
	}
}
