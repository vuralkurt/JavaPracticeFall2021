package javaProjects.C06_GeometrikHesaplama;

public class Cember extends Sekil{

    public Cember(double yaricap) {
        super(yaricap);
    }

    @Override
    public String toString() {
        return "" +
                "yaricap=" + yaricap +
                ", cevrehesaplamacember=" + cevrehesaplamacember() +
                ", alanhesaplamacember=" + alanhesaplamacember() ;
    }
}
