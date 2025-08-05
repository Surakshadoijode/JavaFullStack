package multithreading;

public class TwoThread {

	public static void main(String[] args) {
		Thread t1=new Thread(()-> {
			System.out.println("Thread1 " + Thread.currentThread().getName());});
		t1.setName("Scooby");
		Thread t2=new Thread(()-> {
			System.out.println("Thread2 " + Thread.currentThread().getName());});
		t2.setName("Shaggy");
		t1.start();
		t2.start();
		

	}

}
