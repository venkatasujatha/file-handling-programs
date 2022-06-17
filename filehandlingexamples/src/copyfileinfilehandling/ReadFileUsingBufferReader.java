package copyfileinfilehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileUsingBufferReader {

	public static void main(String[] args) {
		String path="/home/tectoro/sujatha/filesuji.txt";
		
		BufferedReader br=null;
		
		try 
		{
			File file=new File(path);
			br=new BufferedReader(new FileReader(file));
			int i=0;
			while ((i=br.read())!=-1) {
				System.out.print((char)i);
				
			}
			
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		finally {
			try {
				br.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		}

	}

}
