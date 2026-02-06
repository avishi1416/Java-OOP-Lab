import java.util.Scanner;

class MoviePlan {

    int temperature;
    String genre;
    boolean partnerReady;
    String director;

    // Method to take input
    void getInput() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature (in °C): ");
        temperature = sc.nextInt();

        System.out.print("Enter movie genre: ");
        genre = sc.next();

        System.out.print("Is your partner ready? (true/false): ");
        partnerReady = sc.nextBoolean();

        System.out.print("Enter director name: ");
        director = sc.next();
    }

    // Method to check movie plan
    void checkPlan() {

        if (temperature > 25 &&
            genre.equalsIgnoreCase("Thriller") &&
            partnerReady &&
            director.equalsIgnoreCase("Nolan")) {

            System.out.println("\nYes");

        } else {
            System.out.println("\nNo movie plan.");
        }
    }

    // Main method
    public static void main(String[] args) {

        MoviePlan plan = new MoviePlan();
        plan.getInput();
        plan.checkPlan();
    }
}
