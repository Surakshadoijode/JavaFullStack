package project4;

abstract class parent {
	public abstract void child();

	public static void main(String[] args) {
		parent firstchild=new Child1();
		firstchild.child();
		parent secondchild=new Child2();
		secondchild.child();

	}
}