

public class Main {

    public static void main(String[] args) {

        Autore sclavi = new Autore("Tiziano", "Sclavi", 60, "Milano");

        Fumetto dylanDog = new Fumetto(sclavi, "Dylan Dog #1", 3.99);
        Fumetto spiderMan = new Fumetto(new Autore("Stan", "Lee", 90, "New York"), "SpiderMan #1", 4.50);
        Fumetto spiderMan2 = new Fumetto(new Autore("Stan", "Lee", 90, "New York"), "SpiderMan #2", 4.50);
        Fumetto spiderMan3 = new Fumetto(new Autore("Stan", "Lee", 90, "New York"), "SpiderMan #3", 4.50);
        Fumetto spiderMan4 = new Fumetto(new Autore("Stan", "Lee", 90, "New York"), "SpiderMan #4", 4.50);
        Fumetto spiderMan5 = new Fumetto(new Autore("Stan", "Lee", 90, "New York"), "SpiderMan #5", 4.50);
        Fumetto spiderMan6 = new Fumetto(new Autore("Stan", "Lee", 90, "New York"), "SpiderMan #6", 4.50);

        Fumetteria starComics = new Fumetteria("Star Comics");// new Fumetteria("Star Comics");
        System.out.println(starComics.getMagazzino().length);
        starComics.aggiungiFumetto(dylanDog);
        starComics.aggiungiFumetto(spiderMan);
        starComics.aggiungiFumetto(spiderMan2);
        starComics.aggiungiFumetto(spiderMan3);
        starComics.aggiungiFumetto(spiderMan4);
        starComics.aggiungiFumetto(spiderMan5);
        starComics.aggiungiFumetto(spiderMan6);
        starComics.aggiungiFumetto(spiderMan2);
        starComics.aggiungiFumetto(spiderMan3);
        starComics.aggiungiFumetto(spiderMan4);
        starComics.aggiungiFumetto(spiderMan5);
        starComics.aggiungiFumetto(spiderMan6);

        starComics.stampaFumetti();
        System.out.println(starComics.getMagazzino().length);

        starComics.vendiFumetto("SpiderMan #5");

        starComics.stampaFumetti();

    }

}