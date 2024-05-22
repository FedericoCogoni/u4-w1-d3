package es2;
import es2.chiamata.Chiamata;
import es2.sim.Sim;

public class Main {
    public static void main(String[] args) {

        Sim sim1 = new Sim("39 3554658950");
        sim1.aggiungiCredito(50);

        Chiamata[] listaChiamate = new Chiamata[10];
        listaChiamate[0] = new Chiamata("+39 3462784563", 5);
        listaChiamate[1] = new Chiamata("+39 3462784563", 10);
        listaChiamate[2] = new Chiamata("+39 3462784563", 3);
        listaChiamate[3] = new Chiamata("+39 3462784563", 4);
        listaChiamate[4] = new Chiamata("+39 3462784563", 6);

        sim1.setListaChiamate(listaChiamate);

        sim1.stampaDati();
    }
}
