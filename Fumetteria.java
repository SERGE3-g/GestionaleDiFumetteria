public class Fumetteria {

    private Fumetto[] magazzino;
    private String nome;

    public Fumetteria(String nome) {
        this.magazzino = new Fumetto[5];
        this.nome = nome;
    }

    public Fumetteria() {
        this.magazzino = new Fumetto[5];
    }

    public boolean aggiungiFumetto(Fumetto fumetto) {
        if(isPresent(fumetto.getTitolo())) {
            System.out.println("il fumetto è già presente");
            return false;
        }

        if(this.magazzino[magazzino.length -1] != null) {
            this.magazzino = espandiMagazzino();
        }


        for(int i = 0; i < this.magazzino.length; i++) {
            if(magazzino[i] == null) {
                magazzino[i] = fumetto;
                break;
            }
        }

        System.out.println(fumetto.getTitolo() + " è stato aggiunto correttamente!");
        return true;
    }

    public void vendiFumetto(String titolo) {
        //!isPresent(titolo)
        if(isPresent(titolo) == false) {
            System.out.println("Il fumetto non è presente, non puoi venderlo");
            return;
        }

        for(int i = 0; i < this.magazzino.length; i++) {
            if(this.magazzino[i].getTitolo().toLowerCase().equals(titolo.toLowerCase())) {
                this.magazzino[i] = null;
                System.out.println(titolo + " è stato venduto");
                break;
            }
        }
    }

    private boolean isPresent(String titolo) {
        for(Fumetto f : this.magazzino) {
            if(f != null) {
                if(f.getTitolo().toLowerCase().equals(titolo.toLowerCase())) {
                    return true;
                }
            }
        }

        return false;
    }

    private Fumetto[] espandiMagazzino() {
        Fumetto[] nuovoMagazzino = new Fumetto[this.magazzino.length + 1];

        for(int i = 0; i < this.magazzino.length; i++) {
            nuovoMagazzino[i] = this.magazzino[i];
        }

        return nuovoMagazzino;
    }


    public void stampaFumetti() {
        for(Fumetto f : this.magazzino) {
            if(f != null) {
                System.out.println(f);
            }
        }
    }

    public Fumetto[] getMagazzino() {
        return magazzino;
    }

    public void setMagazzino(Fumetto[] magazzino) {
        this.magazzino = magazzino;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}