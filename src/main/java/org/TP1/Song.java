package org.TP1;

public class Song {
    private String title;

    private int time;

    private String singer;

    public Song(String title, int time, String singer) {
        this.title = title;
        this.time = time;
        this.singer = singer;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    @Override
    public String toString(){
        return "Titre: " + this.title + " Singer: " + this.singer + " Time: "  + this.time;
    }
}
