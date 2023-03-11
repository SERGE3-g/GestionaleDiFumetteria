
//
//  create by serge Guea on 11/03/2023
//


public class Autore {


    private String nome;
    private String cognome;
    private int eta;
    private String luogo;

    public Autore(String nome, String cognome, int eta, String luogo) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        this.luogo = luogo;
    }

    public Autore() {

    }

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

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public String getLuogo() {
        return luogo;
    }

    public void setLuogo(String luogo) {
        this.luogo = luogo;
    }

    @Override
    public String toString() {
        return "Autore [nome=" + nome + ", cognome=" + cognome + ", eta=" + eta + ", luogo=" + luogo + "]";
    }


}