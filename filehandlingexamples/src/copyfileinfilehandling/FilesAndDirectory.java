package copyfileinfilehandling;

import java.io.File;
import java.util.Arrays;

//print files and directories in sorted order

public class FilesAndDirectory {

	public static void main(String[] args) {
		
		String path="/home/tectoro/Downloads";
		File file=new File(path);
		File[] listFiles = file.listFiles();
		Arrays.sort(listFiles);
		for(File f:listFiles)
		{
			if(f.isFile())
			System.out.println("File:"+f.getName()+""+f.getAbsolutePath());
		
		else if(f.isDirectory()) 
		{
			System.out.println("Directory:"+f.getName()+""+f.getAbsolutePath());
			
		}
		else
		{
			System.out.println("un known"+f.getName()+""+f.getAbsolutePath());
		}
		}

	}

}
