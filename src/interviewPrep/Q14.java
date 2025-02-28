package interviewPrep;

import java.util.ArrayList;
import java.util.List;

public class Q14 {
    public static void main(String[] args) {
        /*
     Verilen bir arayın elemanlarının ardışık artan toplamını hesaplayıp yeni bir array'a atayan bir program cretae ediniz..

      input : { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 }

      output : { 3, 5+1, 2+7+9, 2+3+5+7 }
         */

        int arr[] = {3, 5, 1, 2, 7, 9, 2, 3, 5, 7,};

        ardisikToplam(arr);

    }

    private static void ardisikToplam(int[] arr) {

        List<Integer> list = new ArrayList<>();

        int sayac = 0;
        int indexBul = 1;

        do {
            int toplam = 0;
            for (int i = 0; i <= sayac; i++) {

                toplam += arr[indexBul - 1 + i];
            }
            sayac++;
            indexBul += sayac;
            list.add(toplam);
        } while (sayac < arr.length / 2 - 1);

        System.out.println(list);

    }
}
