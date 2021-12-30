package javaProjects.C06_GeometrikHesaplama;

public class Sekil {
    double kisakenar;
    double uzunkenar;
    double yaricap;


    public Sekil(double kisakenar, double uzunkenar) {
        this.kisakenar = kisakenar;
        this.uzunkenar = uzunkenar;
    }

    public Sekil(double yaricap) {
        this.yaricap = yaricap;
    }
    public double cevreHesaplama(){

        return (uzunkenar+kisakenar)*2;
    }
    public double alanHesaplama(){
        return uzunkenar*kisakenar;

    }
    public double cevrehesaplamacember(){
        return 2*yaricap*3.14;
    }
    public double alanhesaplamacember(){
        return 3.14*yaricap*yaricap;
    }

}
