package exception;

import java.io.File;

public class FileOrDirectory {

	public static void main(String[] args) {
		File my_file=new File("D:\\suraksha.txt");
		if (my_file.isDirectory()) {
			System.out.println(my_file.getAbsolutePath() + " is directory.\n");
		}else {
			System.out.println(my_file.getAbsolutePath() + " is not Directory.\n");
		}
		if(my_file.canRead()) {
			System.out.println(my_file.getAbsolutePath() + " is File.\n");
		}else {
			System.out.println(my_file.getAbsolutePath() + " is not File.\n");
		}
	}

}
