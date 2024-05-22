package es2.sim;
import es2.chiamata.Chiamata;

public class Sim {
    private String numero;
    private double credito;
    private Chiamata[] listaChiamate;
 //----------------------COSTRUTTORE-----------------------
    public Sim(String numero) {
        this.numero = numero;
        this.credito = 0;
        this.listaChiamate = new Chiamata[5];
    }
//-----------------------METODI---------------------------
    public void aggiungiCredito(double nuovoCredito) {
        this.credito += nuovoCredito;
    }

    public void setListaChiamate(Chiamata[] listaChiamate) {
        this.listaChiamate = listaChiamate;
    }

    public void stampaDati() {
        System.out.println("Sim: " + this.numero);
        System.out.println("Credito disponibile: " + this.credito);
        for (int i = 0; i < listaChiamate.length; i++) {
            if (listaChiamate[i] != null) {
                System.out.println("- Chiamata " + (i + 1) + ": " + listaChiamate[i].getNumeroChiamato() + " - Durata minuti: "
                        + listaChiamate[i].getDurata());
            }
        }
    }
}
