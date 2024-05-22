package es3.article;

public class Article {
    private String codiceProdotto;
    private String descrizione;
    private double prezzo;
    private int inMagazzino;

    //-----------------------------COSTRUTTORE----------------------

    public Article(String codiceProdotto, String descrizione, double prezzo){
        this.codiceProdotto = codiceProdotto;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.inMagazzino = 0;
    }

    //-----------------------METODI---------------------------

    public String getCodiceProdotto(){
        return codiceProdotto;
    }

    public String getDescrizione(){
        return descrizione;
    }

    public void setCodiceCliente(String codiceProdotto){
        this.codiceProdotto = codiceProdotto;
    }

    public double getPrezzo(){
       return this.prezzo = prezzo;
    }

    int getInMagazzino(){
        return this.inMagazzino;
    }

}
