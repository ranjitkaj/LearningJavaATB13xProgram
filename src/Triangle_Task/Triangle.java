package Triangle_Task;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter triangle first side");
        int a = scanner.nextInt();


        System.out.println("Enter triangle second side");
        int b = scanner.nextInt();


        System.out.println("Enter triangle first side");
        int c = scanner.nextInt();

        if(a==b & a==c & b==c)
        {
            System.out.println("It is an equilateral Isosceles.");
        }
        else if(a==b || a==c )
        {
            System.out.println("The triangle is triangle.");
        }
        else
        {
            System.out.println("The triangle is Scalene.");
        }

    }
}
