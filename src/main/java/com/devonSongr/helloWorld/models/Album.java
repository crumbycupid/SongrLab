package com.devonSongr.helloWorld.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) Long id;

    private String title;
    private String artist;
    private Integer songCount;
    private Double length;
    private String imageURL;

    //Need default protected constructor to generate the database table
    protected Album(){}

    public Album(String title, String artist, Integer songCount, Double length, String imageURL){
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.length = length;
        this.imageURL = imageURL;

    }

        public Long getId(){
        return id;
        }

        public String getTitle(){return title;}

        public void setTitle(String title){this.title = title;}

        public String getArtist() {return artist;}

        public void setArtist(String artist) {this.artist = artist;}

        public Integer getSongCount() {return songCount;}

        public void setSongCount(Integer songCount) {this.songCount = songCount;}

        public Double getLength() {return length;}

        public void setLength(Double length) {this.length = length;}

        public String getImageURL() {return imageURL;}

        public void setImageURL(String imageURL) {this.imageURL = imageURL;}

    @Override
    public String toString() {
        return "Album Name: " + title + "from" + artist + " has " + songCount + " songs. The length of the album in seconds is" + length + "seconds. Here is a link to the photo of the album" + imageURL;}

}
