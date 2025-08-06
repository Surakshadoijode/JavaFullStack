package multithreading;
class MyThread extends Thread{
	public MyThread(String name) {
		super(name);
	}
	public void run() {
		for(int i=1;i<=3;i++) {
			System.out.println(getName() + " is running, Priority :" + getPriority());
		}
	}
}

public class PriorityDemo {

	public static void main(String[] args) {
		MyThread t1= new MyThread("Thread 1 (Max)");
		MyThread t2= new MyThread("Thread 2 (Min)");
		MyThread t3= new MyThread("Thread 3 (Norm)");
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		t3.setPriority(Thread.NORM_PRIORITY);
		t1.start();
		t2.start();
		t3.start();
	}

}
