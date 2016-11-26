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
		System.out.println("開始讀擋");
		//使用自動關閉資源語法，在try後面宣告FileReader跟BufferedReader
		try(FileReader file = new FileReader(fileLocation);BufferedReader buffer = new BufferedReader(file);)
		{
			while(buffer.ready())
			{
				//不知道為啥，要換行的話用"\n"在寫出檔案時只有空格的效果
//				content = content + buffer.readLine() + "\n";
				content = content + buffer.readLine() + System.getProperty("line.separator");
			}
		}catch(IOException e)
		{
			e.printStackTrace();
			System.out.println("檔案讀取失敗");
		}
		
		try(FileWriter newFile = new FileWriter(newFileLocation);)
		{
			newFile.write(content);
			newFile.flush();
		}catch(IOException e)
		{
			e.printStackTrace();
			System.out.println("檔案寫入失敗");
		}
		
		System.out.println("寫案完成");
	}

}
