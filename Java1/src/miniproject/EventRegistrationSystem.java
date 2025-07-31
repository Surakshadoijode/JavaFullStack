package miniproject;
import java.util.*;

public class EventRegistrationSystem {
    private static final int MAX_CONFIRMED = 2;
    private List<User> confirmedList = new ArrayList<>();
    private List<User> waitlist = new ArrayList<>();

    public void register(User user) {
        if (confirmedList.contains(user) || waitlist.contains(user)) {
            System.out.println("Duplicate registration detected: " + user.email);
            return;
        }

        if (confirmedList.size() < MAX_CONFIRMED) {
            confirmedList.add(user);
            System.out.println("Registration confirmed for: " + user.name);
        } else {
            waitlist.add(user);
            System.out.println("Added to waitlist: " + user.name);
        }
    }

    public void printStatus() {
        System.out.println("\n--- Confirmed Participants ---");
        confirmedList.forEach(u -> System.out.println(u.name + " - " + u.email));

        System.out.println("\n--- Waitlisted Participants ---");
        waitlist.forEach(u -> System.out.println(u.name + " - " + u.email));
    }
}
