package positiveAffirmation;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class AffirmationGenerator {
    private ArrayList<String> affirmations;

    public AffirmationGenerator() {
        this.affirmations = new ArrayList<>();
        initializeAffirmations();
    }

    private void initializeAffirmations() {
        affirmations.add("I am worthy of success and happiness.");
        affirmations.add("I am confident and capable of achieving my goals.");
        affirmations.add("I attract positivity into my life.");
        affirmations.add("I am grateful for the abundance in my life.");
        affirmations.add("I am in control of my thoughts and emotions.");
        affirmations.add("I radiate positive energy.");
        affirmations.add("I am surrounded by love and positivity.");
        affirmations.add("I believe in my abilities and potential.");
        affirmations.add("I am deserving of all the good things life has to offer.");
        affirmations.add("I choose happiness and joy in every moment.");
    }

    public String generateAffirmation() {
        Random random = new Random();
        int index = random.nextInt(affirmations.size());
        return affirmations.get(index);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AffirmationGenerator affirmationGenerator = new AffirmationGenerator();

        while (true) {
            System.out.println("1. Generate Affirmation");
            System.out.println("2. Exit");

            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    String affirmation = affirmationGenerator.generateAffirmation();
                    System.out.println("Positive Affirmation: " + affirmation);
                    break;

                case 2:
                    System.out.println("Exiting Positive Affirmation Generator. Goodbye!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
