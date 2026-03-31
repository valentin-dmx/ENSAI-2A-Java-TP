package fr.ensai.mediaplayer;

public class Main {
    public static void main(String[] args) {
        Artist artist2 = new Artist("Patate", "De Terre", "fr");
        Song frenchFriesSong = new Song("Frites", artist2, 2026, 45, "J'aime les frites", null, null, null);
        frenchFriesSong.play();
    }
    
}
