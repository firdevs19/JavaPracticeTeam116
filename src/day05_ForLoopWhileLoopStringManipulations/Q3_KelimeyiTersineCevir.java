package day05_ForLoopWhileLoopStringManipulations;

import java.util.Scanner;

public class Q3_KelimeyiTersineCevir {
    public static void main(String[] args) {

        // SORU:kullanıcıdan bir cümle veya kelime girmesini isteyip
        // girilen değeri tersine  yazdıran bir method oluşturun.


        Scanner scanner= new Scanner(System.in);

        System.out.println("Lutfen bir kelime giriniz");

        String kelime = scanner.nextLine();

        System.out.println(tersCevir(kelime));


    }

    public static String tersCevir(String word){

        String bosKova = "";

        for (int i = word.length()-1; i >= 0 ; i--) {



            bosKova +=   word.substring(i,i+1);



        }




        return bosKova;
    }


}
