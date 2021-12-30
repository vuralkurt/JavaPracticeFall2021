package interviewPrep;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        /*
        Kuulanıcının girdiği bir  String'in PALINDROME olup olmadığını kontrol eden bir method create ediniz
        polindrome :tersten okunuşu da aynı olan ifadeierdir.
        ornek : Ey edip Adana`da pide ye,  Traş niçin şart
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir metin giriniz : ");
        String metin = scan.nextLine();


        palindromStringBuilder(metin);
        //polindromForLoop(metin);

    }

    private static void palindromStringBuilder(String metin) {
        StringBuilder sb = new StringBuilder(metin);
        String tersStr = sb.reverse().toString();

        if (tersStr.equalsIgnoreCase(metin)) {
            System.out.println("Girilen metin polindrom ifadedir.." + tersStr);

        } else {
            System.out.println("Girilen ifade polindrom ifade degildir.." + tersStr);
        }
    }
}
