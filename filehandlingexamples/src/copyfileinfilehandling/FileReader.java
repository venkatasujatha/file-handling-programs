package copyfileinfilehandling;

import java.io.File;

public class FileReader {

	public FileReader(String path) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		String path="/home/tectoro/sujatha/filesuji.txt";
		FileReader fr=null;
		
		try {
			
			fr=new FileReader(path);
			int i=0;
			while ((i=fr.read())!=-1) {
				System.out.println((char)i);
				
			}			
		}
		catch (Exception e) {
			e.printStackTrace();
			
		}
		finally {
			fr.close();
			try {
				fr.clone();
			} catch (CloneNotSupportedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	private void close() {
		// TODO Auto-generated method stub
		
	}

	private int read() {
		// TODO Auto-generated method stub
		return 0;
	}

}
