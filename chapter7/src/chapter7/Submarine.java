package chapter7;

public class Submarine implements Diver
{
	String name;
	//constructor
	Submarine()
	{}
	
	Submarine(String name)
	{
		this.name = name;
	}
	
	@Override
	public void swim()
	{
		System.out.println("��a");
	}
	
	@Override
	public void dive()
	{
		System.out.println("���");
	}
}
