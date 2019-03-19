import java.util.Scanner;

public class CH5_EX16 {
    public static void main(String[] args) {
        System.out.print("Enter number: ");
        Scanner input = new Scanner(System.in);
        int NUMBER = input.nextInt();
        String R1 = repeat1("*", NUMBER);
        System.out.println(R1);
        if (NUMBER == 30);
        else
            System.out.println("XXXXX");
    }
    public static String repeat1(String s, int i)
    {
        String tst = "";
        for (int j = 1; j <= i; j++)
        {
            tst = s + " " + tst;
        }
        return tst;

    }


}
