package copyfileinfilehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ImageCopy {

	public static void main(String[] args) {
		Image();
		

	}
	
	public static void Image()
	{
		String path="/home/tectoro/Downloads/laptop.jpg";
		String path1="/home/tectoro/Downloads/laptop-copy.jpg";
		
		FileInputStream suji=null;
		FileOutputStream suji1=null;
		try {
			
			suji=new FileInputStream(path);
			suji1=new FileOutputStream(path1);
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		try {
			System.out.println(suji.available());
		} catch (IOException e1) {
			
			e1.printStackTrace();
		}
		int i=0;
		try {
			while ((i=suji.read())!=-1) {
				suji1.write(i);
				
			}
		} 
		catch (IOException e) {
			
			e.printStackTrace();
		}
		finally {
			if(suji!=null)
			{
				try {
					suji.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			}
			if(suji1!=null)
			{
				try {
					suji1.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			}
			
		}
	}

}
