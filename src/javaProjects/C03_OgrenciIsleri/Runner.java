package javaProjects.C03_OgrenciIsleri;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner {

  static  List<Ogrenci>ogrenciList=new ArrayList<>();
  static  Scanner scan=new Scanner(System.in);

    public static void main(String[] args) {
    anaMenu();


    }

    private static void anaMenu() {
        System.out.println("========OKULUMUZA HOSGELDINIZ========");
        System.out.println("LUTFEN YAPMAK ISTEDIGINIZ ISLEMI SECINIZ\n 1-OGRENCI EKLEME \n 2-OGRENCI LISTELEME" +
                " \n 3-OGRENCI SILME \n 4-CIKIS");
        System.out.println("------------------");
        int secim=scan.nextInt();

        switch (secim){
            case 1:
                ekle();
                break;

            case 2:
                listele();
                break;
            case 3:
                silme();
                break;
            case 4:
                cikis();
                break;
            default:
                System.out.println("Lutfen dogru bir deger giriniz");
                anaMenu();
        }
    }

    private static void cikis() {
        System.out.println("Cikis basari ile gerceklesti...");

    }

    private static void silme() {
        System.out.println("Lutfen silmek istediginiz ogrencinin numarasini giriniz");
        int silinecekNo=scan.nextInt();

        boolean kontrol=true;

        for (Ogrenci k:ogrenciList) {

            if(k.getNo()==silinecekNo){
                System.out.println("Silinen ogrenci:"+k.getAdi()+" "+k.getSoyadi());
                ogrenciList.remove(k);
                kontrol = false;
                break;

            }
        }
        if (kontrol) {
            System.out.println("Aradığınız öğrenci mevcut değil");
        }
        anaMenu();

    }

    private static void listele() {
        System.out.println(ogrenciList);
        anaMenu();
    }

    private static void ekle() {
        scan.nextLine();
        System.out.println("Ogrencinin adini  giriniz");
        String adi=scan.nextLine();
        System.out.println("Ogrencinin  soyadini giriniz");
        String soyadi=scan.nextLine();
        System.out.println("Numarasini giriniz");
        int no=scan.nextInt();
        System.out.println("Ortalamsini giriniz");
        double ortalama=scan.nextDouble();


        Ogrenci ogrenci=new Ogrenci(adi,soyadi,no,ortalama);
        ogrenciList.add(ogrenci);
        System.out.println(ogrenci.toString()+"eklendi");

        anaMenu();

    }
}
