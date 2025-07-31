package exception;
import java.io.File;

public class ReadWritePermission {

	public static void main(String[] args) {
		File my_file=new File("D:\\suraksha.txt");
		if (my_file.canWrite()) {
			System.out.println(my_file.getAbsolutePath() + " can write.\n");
		}else {
			System.out.println(my_file.getAbsolutePath() + " cannot write.\n");
		}
		if(my_file.canRead()) {
			System.out.println(my_file.getAbsolutePath() + " can read.\n");
		}else {
			System.out.println(my_file.getAbsolutePath() + " cannot read.\n");
		}

	}

}
