package day04;

import java.util.ArrayList;
import java.util.List;

public class ArraySoruCozme4 {
    public static void main(String[] args) {

        ortakEleman();
    }

    public static void ortakEleman(){

        String[] data1 = {"Java","SQL","HTML","API","Python","postman","Selenium","devops"};
        String[] data2 = {"Java","SQL","html","Api","selenium","C#","SoapUI","azure"};

        List<String> ortakElemenlarListesi =new ArrayList<>();

        for (int i = 0; i < data1.length; i++) {
            for (int j = 0; j < data2.length; j++) {
                if (data2[j].equalsIgnoreCase(data1[i])){
                    ortakElemenlarListesi.add(data2[j]);

                }

            }

        }

        System.out.println("Ortak Elemanlar :"  + ortakElemenlarListesi);


    }



}

