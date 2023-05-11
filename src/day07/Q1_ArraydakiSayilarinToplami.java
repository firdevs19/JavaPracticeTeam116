package day07;

public class Q1_ArraydakiSayilarinToplami {

    /*
        Create an array of 5 floats and calculate their sum.

        TR:
        5 değişkenlik float'lardan olusan bir dizi oluşturun ve toplamlarını hesaplayın.
     */

    public static void main(String[] args) {

        // float [] numbers=new float[5];
        float[] numbers={1.1f , 2.2f , 3.3f , 4.4f , 5.5f};

        float toplam =0;

        System.out.println("******************  For Loop Cozumu  ******************");

        for (int i = 0; i < numbers.length; i++) {
            toplam +=numbers[i];
        }
        System.out.println("Toplam For Loop : "+toplam);
        System.out.println("\n******************  While Loop Cozumu  ******************");

        int index=0;
        toplam=0; // while deki toplami bulmak icin sifirlama yapiyoruz.

        while (index<numbers.length){

            toplam+=numbers[index];
            index++;

        }
        System.out.println("Toplam While Loop : " + toplam);
        System.out.println("\n******************  While Loop Cozumu 2  ******************");

         index=numbers.length-1;
        toplam=0; // while deki toplami bulmak icin sifirlama yapiyoruz.

        while (index>=0){

            toplam+=numbers[index];
            index--;

        }
        System.out.println("Toplam While Loop 2  : " + toplam);
    }


}
