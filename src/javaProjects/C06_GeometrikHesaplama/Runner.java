package javaProjects.C06_GeometrikHesaplama;

public class Runner {
    public static void main(String[] args) {

        Sekil c=new Cember(5);
        c.cevrehesaplamacember();
        c.alanhesaplamacember();
        System.out.println(c);

        Sekil d=new Dikdortgen(5,6);
        d.alanHesaplama();
        d.cevreHesaplama();
        System.out.println(d);

        Sekil k=new Kare(5,5);
        k.alanHesaplama();
        k.cevreHesaplama();
        System.out.println(k);



    }
}
