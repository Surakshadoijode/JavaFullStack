package miniproject;
import java.util.Scanner;
public class Main {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        EventRegistrationSystem system = new EventRegistrationSystem();

	        while (true) {
	            System.out.print("\nEnter name (or 'exit' to stop): ");
	            String name = sc.nextLine();
	            if (name.equalsIgnoreCase("exit")) break;

	            System.out.print("Enter email: ");
	            String email = sc.nextLine();

	            User user = new User(name, email);
	            system.register(user);
	        }

	        system.printStatus();
	        sc.close();
	    }
	}

