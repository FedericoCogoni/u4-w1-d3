package es1;

public class Rettangolo {

    private int latoCorto;
    private int latoLungo;

    //---------------------------COSTRUTTORE--------------------------
    public Rettangolo(int latoLungo, int latoCorto){
        this.latoLungo = latoLungo;
        this.latoCorto = latoCorto;
    }

    //---------------------------METODI-----------------------------

    public int getPerimetro(){
        return (latoCorto + latoLungo) * 2;
    }

    public int getArea(){
        return latoLungo * latoCorto;
    }

    public void printRettangolo(){
        System.out.println(" - Il perimetro del rettangolo è : " + getPerimetro());
        System.out.println(" - L'area del rettangolo è : " + getArea());
    }

    public void printAndSumDoubleRettangolo(Rettangolo rettangolo1, Rettangolo rettangolo2){
        int doublePerimetro = rettangolo1.getPerimetro() + rettangolo2.getPerimetro();
        int doubleArea = rettangolo1.getArea() + rettangolo2.getArea();

        System.out.println(" - La somma del perimetro dei rettangoli è : " + doublePerimetro);
        System.out.println(" - La somma delle aree dei rettangoli è : " + doubleArea);
    }
}
