package es1;

public class Main {
    public static void main(String[] args) {
        Rettangolo rettangolo1 = new Rettangolo(20, 10);
        rettangolo1.printRettangolo();
        Rettangolo rettangolo2 = new Rettangolo(200, 100);
        rettangolo2.printRettangolo();
        rettangolo1.printAndSumDoubleRettangolo(rettangolo1, rettangolo2);
    }

}
