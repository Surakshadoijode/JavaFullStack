package project4;

class ReportCard {
	private String student_name;
	private int student_roll_number;
	private int student_marks;
	
	public String getname() {
		return student_name;
	}
	public void setname(String student_name) {
		this.student_name=student_name;
	}
	
	public int getrollno() {
		return student_roll_number;
	}
	
	public void setrollno(int student_roll_number) {
		this.student_roll_number=student_roll_number;
	}
	
	public int getmarks() {
		return student_marks;
	}
	
	public void setmarks(int student_marks) {
		this.student_marks=student_marks;
	}
	
	public static void main(String[] args) {
		ReportCard rc=new ReportCard();
		rc.setname("Rashi");
		rc.setrollno(20);
		rc.setmarks(90);
		
		String name=rc.getname();
		int rollno=rc.getrollno();
		int marks=rc.getmarks();
		System.out.println("Name = "+name);
		System.out.println("Roll no = "+rollno);
		System.out.println("Marks = "+marks);
	}

}
