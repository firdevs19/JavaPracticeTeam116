package day04;

import java.util.Scanner;

public class ArraysSoruCozme1 {


    public static void main(String[] args) {

        /*
            Bir array in degerlerini gosteren bir Java programi olusturun
         */

        // int bir array olusturalim
        // Bir array olusturmak icin once data turunu ve size ini tanimlamamiz gerekiyor

    //printArrayMethod();
    arrayElemanlariToplami();

    }

    static int size ; // Birden fazla array olusturmak istsersek size i her yerde kullanabiliriz
    static Scanner scanner = new Scanner(System.in);
    // birden fazla method icinde kullanicidan veri alabilmek ve tekrara dusmemek icin clas level da olusturduk

    public static void printArrayMethod(){

        System.out.println("Lutfen Array'in size'ini belirtin...");
        size = scanner.nextInt();
        int[] ogrencilerinYaslari = new int[size];

        // simdi array icerisine veri eklemeliyiz
        System.out.println("Lutfen ogrencilerin yaslarini giriniz");
        for (int i = 0; i < size; i++) {
            System.out.println(i+1+". Veri");
            ogrencilerinYaslari[i] = scanner.nextInt();

        }

        // Girilen array verilerinin printini almak ivcin bir for loop daha olusturmaliyiz

        System.out.println("Olusturulan Array icerisindeki verilerin ciktisi...");
        for (int i = 0; i < size; i++) {
            System.out.println(ogrencilerinYaslari[i]+" ");

        }



    }
    // Kullanicidan alinan size ile int bir array olusturun
    // ve array icerisindeki elemanlarin toplamini veren bir java methodu yazin

    public static void arrayElemanlariToplami(){

        System.out.println("Lutfen Array'in size'ini belirtin");
        size = scanner.nextInt();
        int[] iscilerinMaasi = new int[size];

        //For loop lullanalim

        for (int i = 0; i < size; i++) {

            System.out.println(i+1 + ". Calisan Maasi ");
            iscilerinMaasi[i] = scanner.nextInt();



        }

        int maasToplami= 0;
        for (int i = 0; i < size; i++) {
            maasToplami=maasToplami+iscilerinMaasi[i];
            //normal yazim: maasToplami += iscilerinMaasi[i];


        }

        System.out.println("Maaslarin toplami : " + maasToplami);

    }


}
