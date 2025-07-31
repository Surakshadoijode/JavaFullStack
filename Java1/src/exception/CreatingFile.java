package exception;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CreatingFile {

	public static void main(String[] args) {
		try {
			File file=new File("D:\\suraksha.txt");
			if(file.createNewFile()) {
				System.out.println("File is created ");
			}else {
				System.out.println("File aready exits");
			}
			FileWriter writer = new FileWriter(file);
			writer.write("Hi java B1");
			writer.close();
			
			FileReader reader=new FileReader(file);
			
			int c;
			while((c=reader.read())!=-1) {
				char ch=(char)c;
				System.out.print(ch);
			}
			reader.close();
		}
		catch(IOException e) {
			System.out.println("Exception");
		}
		

	}
	
}
