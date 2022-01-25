import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        System.out.print("Enter three numbers:");
        Scanner sn1 = new Scanner(System.in);
        Double num1 = sn1.nextDouble();

        Scanner sn2 = new Scanner(System.in);
        Double num2 = sn2.nextDouble();

        Scanner sn3 = new Scanner(System.in);
        Double num3 = sn3.nextDouble();

        Double area = ((num1 + num2 + num3) / 3);

        System.out.println("The average of " + num1 + " and " + num2 + " and " + num3 + " is " + area);
    }
}
