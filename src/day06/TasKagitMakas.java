package day06;

import java.util.Random;
import java.util.Scanner;

public class TasKagitMakas {

    public static void main(String[] args) {

        // Bilgisayara karsi tas kagit makas oyunu oynayacağımız kodları yazınız
        // Kural: 5 puana ilk ulasan oyunu kazanir.

        Scanner scanner= new Scanner(System.in);
        Random rnd = new Random();
        int userChoice=0;
        int compChoice=0;
        int userPoint=0;
        int comPoint=0;

        do {
            System.out.println("Lutfen secim yapiniz:\n1-Tas \n2-Kagit \n3-Makas");
            //Kullanicinin secimini isteyecegiz.
            userChoice = scanner.nextInt();

            //Bilgisayar icin random bir deger uretecegiz.
            compChoice = rnd.nextInt(3) + 1;

            if (userChoice == 1 && compChoice == 2) {
                System.out.println("Bilgisayarin sectigi " + compChoice);
                System.out.println("");
                System.out.println("Kagit tasi sarar -- Bilgisayar kazandi");
                comPoint++;
                System.out.println("Sizin Puaniniz: " + userPoint +"\nBilgisayarin Puani : " + comPoint);

            } else if (userChoice == 1 && compChoice == 3) {
                System.out.println("Bilgisayarin sectigi " + compChoice);
                System.out.println("");
                System.out.println("Tas makasi kirar -- Siz kazandiniz");
                userPoint++;
                System.out.println("Sizin Puaniniz: " + userPoint +"\nBilgisayarin Puani : " + comPoint);

            }else if (userChoice == 2 && compChoice == 1) {
                System.out.println("Bilgisayarin sectigi " + compChoice);
                System.out.println("");
                System.out.println("Kagit tasi sarar -- Siz kazandiniz");
                userPoint++;
                System.out.println("Sizin Puaniniz: " + userPoint +"\nBilgisayarin Puani : " + comPoint);

            }else if (userChoice == 2 && compChoice == 3) {
                System.out.println("Bilgisayarin sectigi " + compChoice);
                System.out.println("");
                System.out.println("Makas kagidi keser -- Bilgisayar kazandi");
                comPoint++;
                System.out.println("Sizin Puaniniz: " + userPoint +"\nBilgisayarin Puani : " + comPoint);

            }else if (userChoice == 3 && compChoice == 1) {
            System.out.println("Bilgisayarin sectigi " + compChoice);
            System.out.println("");
            System.out.println("Tas makasi kirar -- Bilgisayar kazandi");
            comPoint++;
            System.out.println("Sizin Puaniniz: " + userPoint +"\nBilgisayarin Puani : " + comPoint);

            }else if (userChoice == 3 && compChoice == 2) {
                System.out.println("Bilgisayarin sectigi " + compChoice);
                System.out.println("");
                System.out.println("Makas kagidi keser -- Siz kazandiniz");
                userPoint++;
                System.out.println("Sizin Puaniniz: " + userPoint + "\nBilgisayarin Puani : " + comPoint);


            }else {
                System.out.println("Berabere kaldiniz");
            }

        }while (userPoint<5 && comPoint<5);

        if (userPoint<comPoint){

            System.out.println("Bilgisayar kazandi");
        }else {

            System.out.println("Siz kazandiniz");
        }





    }
}
