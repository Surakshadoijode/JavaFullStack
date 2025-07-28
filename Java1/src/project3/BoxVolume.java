package project3;
public class BoxVolume {
		double width, height, depth;
		
		BoxVolume (double w, double h, double d){
			width = w;
			height = h;
			depth = d;	
		}
		double getVolume() {
			return (width)* (height) *(depth);
		}
	

	public static void main(String[] args) {
		BoxVolume bx=new BoxVolume(20,20,30);
		double volume= bx.getVolume();
		System.out.print(volume);
   }
}

