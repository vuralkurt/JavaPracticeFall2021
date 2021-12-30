package interviewPrep;

public class Q13 {
    public static void main(String[] args) {
        /*
       Write a Java Program to swap two numbers Swap (takas) islemini --> a=3, b=5
	 * iken a=5, b=3 degerlerini alması islemidir. iki yoldan yaptiginiz java kodunu
	 * yaziniz. 1.Yol: 3. degisken kullanarak 2.Yol: 3. degisken kullanmadan
         */

        int a = 3;
        int b = 5;

        int c = b;


        b = a;
        a = c;

        System.out.println(a); // 5
        System.out.println(b);

    }
}
