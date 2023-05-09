package day06;

import java.util.Scanner;

public class AdamAsmaca {
    public static void main(String[] args) {

        /*
    Bu programda, kelimeler adlı bir kelime listesi oluşturulacak.
    Ardından, bu listeden rastgele bir kelime seçmek için Math.random() fonksiyonu kullanılmıştır.
    Kullanıcı, tahmin etmek istediği harfleri girebilir. Tahmin edilen harfler,
    kelimenin doğru harfleriyle yer değiştirilir ve kalan hak sayısı tutulur.
    Tahmin edilen kelimenin her aşaması ekrana yazdırılır.
    Kullanıcının tahmin hakkı bittiğinde, doğru kelime ekrana yazdırılır
 */

        Scanner scanner= new Scanner(System.in)
;
        String [] kelimeler = {"java", "programlama", "fonksiyon", "yazilim", "degisken", "kodlama"};
        String  secilenKelime = kelimeler[(int) Math.random()* kelimeler.length]; // kelimeler[3]
        int kelimelength=secilenKelime.length();
        System.out.println("Lutfen bir harf girip ENTER tusuna basiniz");


    }
}
