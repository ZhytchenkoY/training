package homework2;

import java.util.Scanner;

public class Double {
    public static void main(String[] args) {
        System.out.println("Ведите два дробных числа: ");
        Scanner scanner1 = new Scanner(System.in);
        double number1 = scanner1.nextDouble();
        double number2 = scanner1.nextDouble();
        System.out.println(number1+number2);
    }
}


