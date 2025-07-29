package project4;

class Author {
	public String name;
	public String email;
	public char gender;
	Author(String name, String email, char gender) {
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
	public void get_Book_author() {
		System.out.println("Author name: "+ this.name);
		System.out.println("Author email: "+ this.email);
		System.out.println("Author gender :"+ this.gender);
	}

	
	class Book{
		private String name1;
		private double price;
		private int qtyInStock;
		
		public String getname() {
			return name1;
		}
		public void setname(String name1) {
			this.name1=name1;
		}
		
		public double getprice() {
			return price;
		}
		
		public void setprice(double price) {
			this.price=price;
		}
		
		public char getquality() {
			return gender;
		}
		
		public void setquality(int qtyInStock) {
			this.qtyInStock=qtyInStock;
		}
		
		public void printBookDetails() {
            System.out.println("Book name: " + name1);
            System.out.println("Price: " + price);
            System.out.println("Quantity in Stock: " + qtyInStock);
            get_Book_author();
        }
		
	}

	public static void main(String[] args) {
		Author a=new Author("Rashi","rashi@gmail.com",'F'); 
		Author.Book b=a.new Book();
		b.setname("Dev");
		b.setprice(20.28);
		b.setquality(8);
		b.printBookDetails();
	}

}
