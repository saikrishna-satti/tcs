import java.util.Scanner;

public class FibnacoSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        printFibnacoAndSum(count);
        in.close();
        System.out.println("this is answer");
    }

    static void printFibnacoAndSum(int count) {
        int n1 = 0, n2 = 1, n3; 
        int sum = 0;

        if (count >= 1) {
            System.out.print(n1);  // Print the first Fibonacci number
            sum += n1;
        }

        if (count >= 2) {
            System.out.print(" " + n2);  // Print the second Fibonacci number
            sum += n2;
        }

        for (int i = 2; i < count; i++) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            sum += n3;
            n1 = n2;
            n2 = n3;
        }

        System.out.println("\nSum of first " + count + " terms: " + sum);
    }
}
