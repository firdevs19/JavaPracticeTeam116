package dayMayis_03_AdemBey;

import java.util.Random;
import java.util.Scanner;
public class Q1_SayiTahmin {
    /*
        Soru-1) 1 ile 100 arasında rastgele üretilen sayının kullanıcının kaçıncı denemede tahmin ettiğini hesaplayan,
     ayrıca kullanıcıyı "daha büyük sayı giriniz","daha küçük sayı giriniz" şeklinde  yönlendiren programı
     metot kullanarak yazınız.
     */

            public static void main(String[] args) {

                Random random=new Random();
                int sayi= random.nextInt(101);
                int tahmin=102;
                int sayac=0;
                Scanner scanner=new Scanner(System.in);
                while(tahmin!=sayi){
                    System.out.println("lütfen tahminizi giriniz: ");
                    tahmin=scanner.nextInt();
                    sayac++;
                    if (sayi==tahmin)
                        System.out.println("tebrikler "+sayac+" . seferde bildiniz");
                    else if (tahmin>sayi) {
                        System.out.println("daha küçük bir sayı giriniz");
                    }else System.out.println("daha büyük bir sayı giriniz");
                }
            }
        }




