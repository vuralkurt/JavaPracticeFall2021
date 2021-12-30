package javaProjects.C03_OgrenciIsleri;

public class Ogrenci {

    private String adi;
    private String soyadi;
    private int no;
    private double ortalama;

    public Ogrenci(String adi, String soyadi, int no, double ortalama) {
        this.adi = adi;
        this.soyadi = soyadi;
        this.no = no;
        this.ortalama = ortalama;
    }

   public Ogrenci(){

   }

    @Override
    public String toString() {
        return "\nOgrenci" +
                "adi='" + adi + '\'' +
                ", soyadi='" + soyadi + '\'' +
                ", no=" + no +
                ", ortalama=" + ortalama;
    }


    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public double getOrtalama() {
        return ortalama;
    }

    public void setOrtalama(double ortalama) {
        this.ortalama = ortalama;
    }
}
