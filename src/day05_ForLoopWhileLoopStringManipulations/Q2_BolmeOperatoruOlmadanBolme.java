package day05_ForLoopWhileLoopStringManipulations;

import java.util.Scanner;

public class Q2_BolmeOperatoruOlmadanBolme {

    static int bolum = 0;

    public static void main(String[] args) {

        /*

             Kullanicidan bolunen ve bolen seklinde 2 sayi alalim ve bolme operatoru
             kullanmadan bolme islemini gerceklestirip bolumu hesaplayan method create ediniz.
         */


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bolmek istediginiz sayiyi giriniz");

        int bolunen = scanner.nextInt();

        System.out.println("Lutfen bolen sayiyi giriniz");

        int bolen = scanner.nextInt();

        // bolumu dongunu icerisinde saymasi icin her seferinde artacakbir sayac olusturdum.


        System.out.println((bolunen + bolen * bolum) + " / " + bolen + " = " + bolum);

        System.out.println(bol(bolunen, bolen));


    }

    public static int bol(int a, int b) {

        int bolum = 0;


        while (a >= b) {

            a -= b; // bolunen = bolen - bolen

            bolum++;

        }

        return bolum;

    }
}
