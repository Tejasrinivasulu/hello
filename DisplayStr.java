import java.util.*;

public class DisplayStr {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int n = 0;
            boolean validInput = false;

            // Input validation for array size
            while (!validInput) {
                System.out.print("Enter the array size: ");
                if (s.hasNextInt()) {
                    n = s.nextInt();
                    if (n > 0) {
                        validInput = true;
                    } else {
                        System.out.println("Array size must be a positive integer. Please try again.");
                    }
                } else {
                    System.out.println("Invalid input. Please enter an integer.");
                    s.next(); // Clear invalid input
                }
            }
            s.nextLine(); // Clear the newline character

            List<String> arr = new ArrayList<>();
            System.out.println("Enter the elements in the array:");
            for (int i = 0; i < n; i++) {
                arr.add(s.nextLine());
            }

            System.out.println("Array: " + arr);
        }
    }
}
