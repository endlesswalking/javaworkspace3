package chapter10SelfPractice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadAndWrite
{
	public static void main(String[] args)
	{
		String fileLocation = "C:\\Users\\USER\\Desktop\\javaworkspace3\\chapter10SelfPractice\\accountAndPassword.txt";
		String newFileLocation = "C:\\Users\\USER\\Desktop\\javaworkspace3\\chapter10SelfPractice\\accountAndPasswordNewFile.txt";
//		System.out.println("C:\\Users\\USER\\Desktop\\javaworkspace3\\chapter10SelfPractice.txt");
		String content = "";
		System.out.println("�}�lŪ��");
		//�ϥΦ۰������귽�y�k�A�btry�᭱�ŧiFileReader��BufferedReader
		try(FileReader file = new FileReader(fileLocation);BufferedReader buffer = new BufferedReader(file);)
		{
			while(buffer.ready())
			{
				//�����D��ԣ�A�n���檺�ܥ�"\n"�b�g�X�ɮ׮ɥu���Ů檺�ĪG
//				content = content + buffer.readLine() + "\n";
				content = content + buffer.readLine() + System.getProperty("line.separator");
			}
		}catch(IOException e)
		{
			e.printStackTrace();
			System.out.println("�ɮ�Ū������");
		}
		
		try(FileWriter newFile = new FileWriter(newFileLocation);)
		{
			newFile.write(content);
			newFile.flush();
		}catch(IOException e)
		{
			e.printStackTrace();
			System.out.println("�ɮ׼g�J����");
		}
		
		System.out.println("�g�ק���");
	}

}
