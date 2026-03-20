package fr.ensai.mediaplayer;

/**
 * Represents an artist
 */
public class Artist {

    //Attributs
    private String firstName;
    private String lastName;
    private String nationality;

    /**
     * Constructs a new Artist object
     */
    public Artist(String firstName, String lastName, String nationality) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationality = nationality;
    }

    public String toString() {
        return String.format("%s %s",this.firstName, this.lastName);
    }
}
