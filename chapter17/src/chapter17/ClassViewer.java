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
			//動態載入類別
			Class clz = Class.forName("chapter17.Student");
			System.out.println("是否為介面" + clz.isInterface());
			System.out.println("父類別" + clz.getSuperclass().getName());
			
			//透過類別物件載入其他資料
			Package p = clz.getPackage();
			Constructor[] constructors = clz.getDeclaredConstructors();
			Method[] methods = clz.getDeclaredMethods();
			Field[] fields = clz.getDeclaredFields();
			
			//產生物件
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
			System.out.println("未找到目標類別");
		}
	}
}
