package innerClass;

public class Some2
{
	public static String className = "Some2";
	
	public static class Other2
	{
		public void printOuterClassName()
		{
			System.out.println(className);
		}
	}
}
