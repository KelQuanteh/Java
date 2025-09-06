import java.util.Scanner;

public class GraphNodes {
    
    // factorial method with error code for invalid input
    public static int factorial(int n) {
        if (n < 0) {
            System.err.println("Error: Factorial is undefined for negative numbers.");
            return -1;
        }

        if (n == 0 || n == 1) {
            return 1;
        } else {
            return factorial(n - 1) * n;
        }
    }

    public static void main(String[] args) {
        int n, edges;
        Scanner input = new Scanner(System.in);

        System.out.println("How many nodes does your graph have?");
        n = input.nextInt();

        if (n < 2) {
            System.err.println("A graph must have at least 2 nodes to form edges.");
        } else {
            int fn = factorial(n);
            int fnMinus2 = factorial(n - 2);
            int f2 = factorial(2);

            if (fn == -1 || fnMinus2 == -1 || f2 == -1) {
                System.err.println("Factorial calculation failed due to invalid input.");
            } else {
                edges = fn / (fnMinus2 * f2);
                System.out.println("Your graph can have " + edges + " max edges.");
            }
        }

        input.close();
    }
}
