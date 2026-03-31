package fr.ensai.mediaplayer;
import java.util.List;

public class Playlist {
    private String name;
    private List<Media> mediaList;
    private int duration;

    public Playlist(String name) {
        this.name = name;
        this.mediaList = null;
        this.duration = 0;
    }

    public void addMedia(Media media) {
        this.mediaList.add(media);
        this.duration = this.duration + media.getDuration();
        return;
    }


}
