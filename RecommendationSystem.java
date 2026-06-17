import java.util.*;

public class RecommendationSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] movies = {
                "Avengers",
                "Interstellar",
                "Inception",
                "Bahubali",
                "KGF"
        };

        System.out.println("Available Movies:");

        for(int i = 0; i < movies.length; i++) {
            System.out.println((i + 1) + ". " + movies[i]);
        }

        System.out.print("\nEnter your favorite movie number: ");
        int choice = sc.nextInt();

        System.out.println("\nRecommended Movies:");

        switch(choice) {
            case 1:
                System.out.println("Inception");
                System.out.println("KGF");
                break;

            case 2:
                System.out.println("Inception");
                System.out.println("Avengers");
                break;

            case 3:
                System.out.println("Interstellar");
                System.out.println("Bahubali");
                break;

            case 4:
                System.out.println("KGF");
                System.out.println("Avengers");
                break;

            case 5:
                System.out.println("Bahubali");
                System.out.println("Avengers");
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}
