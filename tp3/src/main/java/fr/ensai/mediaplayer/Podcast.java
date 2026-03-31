package fr.ensai.mediaplayer;

public class Podcast extends Song{
    private String title;
    private String host;
    private String topic;
    private int duration;
    private int year;
    private String subtitles;
    

    @Override
    public String getText() {
        return(this.subtitles);
    }

    /**
     * String representation of the Podcast.
     */
    @Override
    public String toString() {
        return String.format("Podcast %s by %s",this.title, this.host.toString());
    }
}
