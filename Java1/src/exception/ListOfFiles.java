package exception;
import java.io.File;

public class ListOfFiles {

	public static void main(String[] args) {
		File file = new File("D:\\");
		String[] fileList=file.list();
		for(String name:fileList) {
			System.out.println(name);
		}
	}

}
