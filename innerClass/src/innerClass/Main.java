package innerClass;

public class Main
{
	public static void main(String[] args)
	{
		//�ϥΤ������O�e�n�����ͥ~�����O������
		Some1 some1 = new Some1();
		Some1.Other other1 = some1.new Other();
		
		//�p�G�����Ostatic�h�i�H����new�X����
		Some2.Other2 other2 = new Some2.Other2();
		other2.printOuterClassName();
		
	}
}
