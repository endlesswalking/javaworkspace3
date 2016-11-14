package chapter17;

public class Student
{
	private String name;
	private Integer score;
	public Student(){};
	public Student(String name,int score)
	{
		this.name = name;
		this.score = score;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setScore(int number)
	{
		this.score = number;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public int getScore()
	{
		return this.score;
	}
}
