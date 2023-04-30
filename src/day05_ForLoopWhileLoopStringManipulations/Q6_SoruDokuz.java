package day05_ForLoopWhileLoopStringManipulations;

import java.util.Scanner;

public class Q6_SoruDokuz {
    public static void main(String[] args) {

        /*
                StringMethods:
                cift uzunlukta bir degiskenin ortasindaki harfi konsolda yazdirmak icin bir Java programi yaziniz.
                Eger kelime cift sayida harf iceriyorsa ortadaki 2 harfi yazdirin
                ORNEK:
                INPUT      :  Python
                OUTPUT :   th
        */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz :");
        String kelime= scanner.next();

        if (kelime.length()%2==0){
            System.out.println(kelime.substring(kelime.length() / 2 - 1, kelime.length() / 2 + 1));


        }else {
            System.out.println("Kelime cift uzunlukta degil");
        }
    }
}
