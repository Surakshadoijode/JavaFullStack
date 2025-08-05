package stringsprog;

public class CharAtGivenIndex {

	public static void main(String[] args) {
		String str=new String("HelloWorld");
		System.out.println("Original String "+str);
		int index1=str.charAt(5);
		int index2=str.charAt(3);
		System.out.println("Char at index 5 :"+ (char)index1);
		System.out.println("Char at index 3 :"+ (char)index2);
	}

}
