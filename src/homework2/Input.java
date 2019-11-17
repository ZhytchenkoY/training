package homework2;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя:");
        String userName = scanner.next();


        System.out.println("В каком городе Вы проживаете?");
        String sity = scanner.next();


        System.out.println("Сколько Вам лет?");
        int age = scanner.nextInt();


        System.out.println("Какое Ваше хобби?");
        String hobby = scanner.next();

        System.out.println("Человек по имени " + userName + " проживает в городе " + sity);
        System.out.println("этому человеку " + age + " лет и он любит заниматся " + hobby);

    }
}