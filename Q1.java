import java.util.Scanner;

public class Q1 {
    public static void main(String[] args)
    {
        System.out.print("Enter a number for radius:");
        Scanner sn = new Scanner(System.in);
        Double radius = sn.nextDouble();

        Double area = Math.PI * radius * radius;
        System.out.println("The area for the circle of radius " + radius + " is " + area);

    }
}
