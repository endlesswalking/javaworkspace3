package innerClass;

public class Main
{
	public static void main(String[] args)
	{
		//使用內部類別前要先產生外部類別的物件
		Some1 some1 = new Some1();
		Some1.Other other1 = some1.new Other();
		
		//如果內部是static則可以直接new出物件
		Some2.Other2 other2 = new Some2.Other2();
		other2.printOuterClassName();
		
	}
}
