package es3.client;

import java.util.Date;

public class Client {
    private String nome;
    private String cognome;
    private String codiceCliente;
    private String Email;
    private Date dataIscrizione;


    //-----------------------------COSTRUTTORE----------------------

    public Client(String nome, String cognome, String codiceCliente, String Email, Date dataIscrizione){
        this.nome = nome;
        this.cognome = cognome;
        this.codiceCliente = codiceCliente;
        this.Email = Email;
        this.dataIscrizione = dataIscrizione;
    }
    //-----------------------METODI---------------------------

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getCodiceCliente() {
        return codiceCliente;
    }

    public void setCodiceCliente(String codiceCliente) {
        this.codiceCliente = codiceCliente;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public Date getDataIscrizione() {
        return dataIscrizione;
    }

    public void setDataIscrizione(Date dataIscrizione) {
        this.dataIscrizione = dataIscrizione;
    }
}
