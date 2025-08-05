package multithreading;
import java.util.Random;

class ColourTask implements Runnable {
    String[] colours = {"white", "blue", "black", "green", "red", "yellow"};
    Random rand = new Random();
    
    @Override
    public void run() {
        while (true) {
            int index = rand.nextInt(colours.length);
            String selectedColour = colours[index];
            System.out.println("Selected Colour: " + selectedColour);

            if (selectedColour.equals("red")) {
                System.out.println("Red colour matched. Stopping display.");
                break;
            }

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }
    }
}

public class ColourThread {

	public static void main(String[] args) {
		ColourTask task = new ColourTask();
        Thread t = new Thread(task);
        t.setName("ColourPicker");
        t.start();

	}

}
