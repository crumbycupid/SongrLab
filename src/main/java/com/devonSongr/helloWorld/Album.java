package com.devonSongr.helloWorld;

public class Album {
    private String title;
    private String artist;
    private Integer songCount;
    private Integer length;
    private String imageURL;

    public Album(String title, String artist, Integer songCount, Integer length, String imageURL){
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.length = length;
        this.imageURL = imageURL;

    }

        public String getTitle(){
        return title;
        }

        public void setTitle(String title){
        this.title = title;
        }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public Integer getSongCount() {
        return songCount;
    }

    public void setSongCount(Integer songCount) {
        this.songCount = songCount;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    @Override
    public String toString() {
        return "Album Name: " + title + "from" + artist + " has " + songCount + " songs. The length of the album in seconds is" + length + "seconds. Here is a link to the photo of the album" + imageURL;}

}
