
public class Fumetto {

    private Autore autore;
    private String titolo;
    private double prezzo;

    public Fumetto(Autore autore, String titolo, double prezzo) { // costruttore con parametri
        this.autore = autore;
        this.titolo = titolo;
        this.prezzo = prezzo;
    }

    public Fumetto() { // costruttore vuoto

    }

    public Autore getAutore() {
        return autore;
    }

    public void setAutore(Autore autore) {
        this.autore = autore;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    @Override //  override del metodo toString() della classe Object
    public String toString() {
        return "Titolo: " + this.titolo + " Autore: " + this.autore.getNome() + " " + this.autore.getCognome() + " Prezzo: " + this.prezzo;
    }
}