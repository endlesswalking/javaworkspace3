package chapter17;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassViewer
{
	public static void main(String[] args)
	{
		try
		{
			//�ʺA���J���O
			Class clz = Class.forName("chapter17.Student");
			System.out.println("�O�_������" + clz.isInterface());
			System.out.println("�����O" + clz.getSuperclass().getName());
			
			//�z�L���O������J��L���
			Package p = clz.getPackage();
			Constructor[] constructors = clz.getDeclaredConstructors();
			Method[] methods = clz.getDeclaredMethods();
			Field[] fields = clz.getDeclaredFields();
			
			//���ͪ���
			try
			{
			Object object1 = clz.newInstance();
			
			Constructor c = clz.getConstructor(String.class,Integer.TYPE);
			Object object2 = c.newInstance("Bob",100);
			
			Method nameSetter = clz.getMethod("setName",String.class);
			nameSetter.invoke(object1,"Dary");
			Method nameGetter = clz.getMethod("getName");
			System.out.println(nameGetter.invoke(object1));
			}catch(Exception e){e.printStackTrace();}
		}catch(ClassNotFoundException e)
		{
			System.out.println("�����ؼ����O");
		}
	}
}
