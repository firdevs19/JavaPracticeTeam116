package dayMayis_03_AdemBey;

import java.util.Arrays;

public class Q7_Arrays {
/*
        Soru 7- Verilen bir array’e istenen bir elemani ekleyip bize donduren bir method yazin,
        eski array’e yeni degeri atayin.

 */


    public static void main(String[] args) {
        int [] arr={3,5,8,4}; // verilen array

        int eklenecekEleman=19; //eklenmesi istenen eleman

        System.out.println(Arrays.toString(  elemanEkle(arr, eklenecekEleman)  ));

    }
    public static int [] elemanEkle(int [] arr, int eklenecekEleman){
        int [] yeniArray= new int [arr.length+1];
        for (int i = 0; i < arr.length; i++) {
            yeniArray[i]=arr[i];
        }
        yeniArray[yeniArray.length-1]=eklenecekEleman;

        arr=yeniArray;

        return arr;
    }

}
