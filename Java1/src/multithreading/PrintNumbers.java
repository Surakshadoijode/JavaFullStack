package multithreading;

class PrintNumbers extends Thread {
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.print(i + " ");
			if( i==5) {
				try {
					Thread.sleep(5000);
				}catch(InterruptedException e){
					System.out.println(e);
				}
			}
		}
	}

	public static void main(String[] args) {
		PrintNumbers t=new PrintNumbers();
		t.start();
	}

}
