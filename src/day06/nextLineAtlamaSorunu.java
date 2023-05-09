package day06;

import java.util.Scanner;

public class nextLineAtlamaSorunu {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Adinizi ve soyadinizi giriniz:");

        String name = scanner.nextLine();

        System.out.print("Lutfen yasinizi giriniz:");
        int age = scanner.nextInt();
        scanner.nextLine();//dummy

        System.out.println("Lutfen mesleginizi giriniz:");
        String job = scanner.nextLine();


    }
}
