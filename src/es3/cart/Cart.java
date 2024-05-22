package es3.cart;
import es3.client.Client;
import es3.article.Article;

public class Cart {
    private Client cliente;
    private Article[] elencoArticoli;

    //-----------------------------COSTRUTTORE----------------------

    public Cart(Client c) {
        this.cliente = c;
        this.elencoArticoli = new Article[0];
    }
    //-----------------------METODI---------------------------

    public Client getCliente() {
        return cliente;
    }

    public void setCliente(Client cliente) {
        this.cliente = cliente;
    }

    public Article[] getElencoArticoli() {
        return elencoArticoli;
    }

    public void setElencoArticoli(Article[] elencoArticoli) {
        this.elencoArticoli = elencoArticoli;
    }

}

