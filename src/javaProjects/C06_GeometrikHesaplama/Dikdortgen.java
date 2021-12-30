package javaProjects.C06_GeometrikHesaplama;

public class Dikdortgen extends Sekil{

    public Dikdortgen(double kisakenar, double uzunkenar) {
        super(kisakenar, uzunkenar);
    }

    @Override
    public String toString() {
        return "" +
                "kisakenar=" + kisakenar +
                ", uzunkenar=" + uzunkenar +
                ", cevreHesaplama=" + cevreHesaplama() +
                ", alanHesaplama=" + alanHesaplama() ;
    }
}
