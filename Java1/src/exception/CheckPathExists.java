package exception;
import java.io.File;

public class CheckPathExists {

	public static void main(String[] args) {
		File file=new File("C:\\Users\\91948\\yolov5_new\\detect.py");
		if(file.exists())
		{
			System.out.println("The directory or file exists.\n");
		}else {
			System.out.println("The directory or file does not exits.\n");
		}

	}

}
