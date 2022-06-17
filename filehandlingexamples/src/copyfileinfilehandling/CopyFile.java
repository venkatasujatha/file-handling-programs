package copyfileinfilehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {

	public static void main(String[] args) {
		copy();

	}
	public static void copy()
	{
		String file="/home/tectoro/Downloads/sujatha.pdf";
		String copy="/home/tectoro/Downloads/sujatha-copy.pdf";
		
		FileInputStream fis=null;
		FileOutputStream fos=null;
		
		try {
			
			fis=new FileInputStream(file);
			fos=new FileOutputStream(copy);
			
		} 
		catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		try {
			System.out.println(fis.available());
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		int i=0;
		try {
			while ((i=fis.read())!=-1) {
				fos.write(i);
				
				
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		finally
		{
			//close the streams
			
			if(fis!=null)
			{
				try {
					fis.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			}
			if(fos!=null)
			{
				try {
					fos.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			}
		}
		
	}

}
