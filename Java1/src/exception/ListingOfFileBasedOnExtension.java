package exception;
import java.io.FilenameFilter;
import java.io.File;

public class ListingOfFileBasedOnExtension {

	public static void main(String a[]) {
		File file=new File("C:\\Users\\91948\\yolov5_new");
		String[] list=file.list(new FilenameFilter(){
			public boolean accept(File dir,String name) {
				if(name.toLowerCase().endsWith(".py")){
					return true;
				} else {
					return false;
				}
			}
		});
		for(String f:list) {
			System.out.println(f);
		}
	}

}
