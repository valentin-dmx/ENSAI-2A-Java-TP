package fr.ensai.mediaplayer;

public abstract class Media {
    protected String title;
    protected int duration;
    protected int year;


    protected Media(String title, int duration, int year) {
        this.title = title;
        this.duration = duration;
        this.year = year;
    }

    public String getTitle() {
        return(this.title);
    }

    public int getYear() {
        return(this.year);
    }

    public int getDuration() {
        return(this.duration);
    }

    protected abstract String getText();

    protected abstract String toString ();

    public void play() {
        String text = this.getText();

        if (text == null) {
            System.out.println("No content available.");
            return;
        }

        for (String word : text.split(" ")) {
            System.out.println(word);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("Thread was interrupted");
            }
        }
        return;
    }
}