package copyfileinfilehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadFileUsingFileInputStream {

	public static void main(String[] args) {
		String path="/home/tectoro/sujatha/filesuji.txt";
		FileInputStream fis=null;
		try {
		
		File file=new File(path);
		
		fis=new FileInputStream(file);
		int i=0;
		
		while ((i=fis.read())!=-1) 
		{
			System.out.print((char)i);
		}
		}
		catch (Exception e) {
			e.printStackTrace();
			
		}
		finally {
			try {
				fis.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}

	}

}
