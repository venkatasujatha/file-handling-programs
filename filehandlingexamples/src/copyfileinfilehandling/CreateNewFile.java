package copyfileinfilehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class CreateNewFile {

	public static void main(String[] args) {
		
		//newFile();
		//newFile1();
		newFile2();

	}
	
	//1.using File
	
	public static void newFile()
	{
		String path="/home/tectoro/sujatha/filehandling/sample888.txt";
			
		File file=new File(path);
		try {
			boolean flag = file.createNewFile();
			if(flag)
			{
				System.out.println("file created");
			}
			else
			{
				System.out.println("already exists");
			}
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	//2.fileoutputstream along with scanner
	
	public static void newFile1()
	{
		Scanner sn=new Scanner(System.in);
		System.out.println("enter the location path");
		String line = sn.nextLine();
		System.out.println("enter the content");
		String content = sn.nextLine();
		
		try {
			FileOutputStream fos=new FileOutputStream(line, true);
			try {
				
				byte[] b=content.getBytes();
				fos.write(b);
				fos.close();
				System.out.println("file is saved on the location path");
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("something went wrong...");
			
			e.printStackTrace();
		}
		
	}
	
	//java nio utils
	
	public static void newFile2()
	{
		try
		{
			Path p=Paths.get("/home/tectoro/sujatha/filehandling/mac.txt");
			Path path = Files.createFile(p);
			System.out.println("new file is created at..."+path);
			
		}
		catch (Exception e) {
			System.out.println("something went wrong");
			
		}
	}
	

}
