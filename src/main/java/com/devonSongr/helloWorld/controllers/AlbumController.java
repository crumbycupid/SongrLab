package com.devonSongr.helloWorld.controllers;

import com.devonSongr.helloWorld.models.Album;
import com.devonSongr.helloWorld.repositories.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;


@Controller
public class AlbumController {

        //Wire Repo to talk to DB
    @Autowired
    AlbumRepository albumRepository;


    //capitalize
    @GetMapping("/")
    public String getHome(){
        return "welcome.html";
    }

    @GetMapping("/albums")
    public String getAllAlbums(Model m){
        Album album1 = new Album("Title", "Artist", 5, 5.5, "imageURL");
        Album album2 = new Album("Title", "Artist", 5, 5.5, "imageURL");
        Album album3 = new Album("Title", "Artist", 5, 5.5, "imageURL");

        ArrayList<Album> albums = new ArrayList<>();
        albums.add(album1);
        albums.add(album2);
        albums.add(album3);

        m.addAttribute("albums", albums);

        return "albums.html";
    }

    @PostMapping("/albums")
    public String createAAlbum(String title, String artist, Integer songCount, Double length, String imageURL){
        Album album = new Album(title, artist, songCount, length, imageURL);
        return "albums.html";
    }

    @GetMapping("/hello")
    public String getHello(Model m){
        m.addAttribute("name", "Ted");
        return "hello";
    }

    @GetMapping("/capitalize/{word}")
    public String capitalize(@PathVariable String word){
        return word.toUpperCase();
    }

}
