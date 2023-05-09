package dayMayis_03_AdemBey;

public class Q8_MultiArrays_Soru1 {
    /*
        Soru 1- Verilen 2 katli bir array’de bulunan cift sayilari toplayip,
                sonucu yazdiran bir method olusturun.
     */
    public static void main(String[] args) {
        int [][] arr={   {3,4,5}  ,  {2,8,6,7}  ,  {2,3,6,1}  ,  {2,3,6,9,6}  ,  {6,4,6,8,12}};

        ciftSayilariTopla(arr);
        ciftSayiToplaForEach(arr);
    }
    public static void ciftSayilariTopla(int [][] arr){

        int toplam=0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]%2==0) {
                    toplam += arr[i][j];
                }
            }
        }
        System.out.println("Cift sayilarin toplami : " + toplam);
    }
    public static void ciftSayiToplaForEach(int[][] arr){

        int toplam=0;
        for (int[] dis:arr
             ) {
            for (int icindex:dis
                 ) {
                if ((icindex % 2) == 0){
                   toplam+=icindex;
                }
            }
        }
        System.out.println("Cift sayilarin toplami(For each ile) : " + toplam);
    }
}
