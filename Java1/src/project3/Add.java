package project3;

public class Add {
	int input1,input2;
	Add(int input1, int input2){
		this.input1=input1;
		this.input2=input2;
	}
	
	static int add(int input1, int input2) {
		if(input1<0) 
			input1=(-1)*input1;
		int n1=input1%10;
		if(input2<0)
			input2=(-1)*input2;
		int n2=input2%10;
		int add1=n1+n2;
		return add1;
	}

	public static void main(String[] args) {
		int res= add(-267,-154);
		System.out.println("Result after adding last digits :"+ res);

	}

}
