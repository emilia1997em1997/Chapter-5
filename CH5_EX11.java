import java.util.Scanner;

public class CH5_EX11 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int NUMBER1 = 2;
            int NUMBER2;
            int NUMBER3;
            int NUMBER4;
            int SMALLEST = 0;
            System.out.println("Number one is: " + NUMBER1);
            int N2 = input.nextInt();
            System.out.println("Number two is: ");
            int N3 = input.nextInt();
            System.out.println("Number three is: ");
            if (N2 < SMALLEST) {
                SMALLEST = N2;
            }
            if (N3 < SMALLEST) {
                SMALLEST = N3;
            }
            System.out.println("The smallest number is: " + Math.min(N2, N3));
        }
    }
}

