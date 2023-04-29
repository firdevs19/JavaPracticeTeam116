package day05_ForLoopWhileLoopStringManipulations;

import java.util.Scanner;

public class Q4_SoruYedi {

    public static void main(String[] args) {


        /*

            Kullanıcıdan bir dize (string) ve bir cümle isteyin.
            Dize'nin cümle içindeki tekrarlanma sayısını (case sensitive olmadan) bulun ve yazdırın.

            Örnekler:
            sentences = "hihihi", String = "hi", çıktı = "hihihi içinde 3 adet "hi" vardır"
            sentences = "I am coming", String = "com", çıktı = "I am coming içinde 1 adet "com" vardır"
         */


        Scanner scanner = new Scanner(System.in);

        System.out.println("lutfen bir cumle giriniz");

        String cümle = scanner.nextLine();

        System.out.println("Lutfen bir kelime giriniz");

        String kelime = scanner.nextLine();


        int sayac = 0;

        for (int i = 0; i < cümle.length(); i++) {

            if (cümle.substring(i, i + kelime.length()).equalsIgnoreCase(kelime)) ;

            sayac++;

        }

        System.out.println(" Cumle icinde : " + sayac + "kadar" + "tekrarlanan" + kelime + "vardir");

    }


}




