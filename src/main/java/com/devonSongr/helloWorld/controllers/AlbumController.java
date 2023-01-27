package com.devonSongr.helloWorld.controllers;

import com.devonSongr.helloWorld.models.Album;
import com.devonSongr.helloWorld.repositories.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;
import java.util.List;


@Controller
public class AlbumController {

        //Wire Repo to talk to DB
    @Autowired
    AlbumRepository albumRepository;

    @GetMapping("/")
    public String getHome(){
        return "welcome.html";
    }

    @GetMapping("/albums")
    public String getAllAlbums(Model m){
        List<Album> albums = albumRepository.findAll();
        m.addAttribute("albums", albums);
        return "albums.html";
    }

    @PostMapping("/albums")
    public RedirectView createAlbum(String title, String artist, Integer songCount, Double length, String imageURL){
        Album album = new Album(title, artist, songCount, length, imageURL);
        albumRepository.save(album);
        return new RedirectView("/albums");
    }

    @DeleteMapping("/delete-album")
    public RedirectView deleteAlbum(long albumId){
        albumRepository.deleteById(albumId);
        return new RedirectView("/albums");
    }


//    @GetMapping("/capitalize/{word}")
//    public String capitalize(@PathVariable String word){
//        return word.toUpperCase();
//    }

    public ArrayList<Album> getAlbumArrayList(){
        ArrayList<Album> albums = new ArrayList<>();
        albums.add(new Album("The Carter", "Lil Wayne", 21, 79.07, "https://upload.wikimedia.org/wikipedia/en/thumb/d/d8/Lil_Wayne_-_Tha_Carter.jpg/220px-Lil_Wayne_-_Tha_Carter.jpg"));
        albums.add(new Album("Confessions", "Usher", 22, 77.22, "https://upload.wikimedia.org/wikipedia/en/thumb/7/74/Usher_-_Confessions_album_cover.jpg/220px-Usher_-_Confessions_album_cover.jpg"));
        albums.add(new Album("Get Rich or Die Tryin", "50 Cent", 19, 53.44, "https://upload.wikimedia.org/wikipedia/en/thumb/9/9d/Get_Rich_Or_Die_Tryin%27.JPG/220px-Get_Rich_Or_Die_Tryin%27.JPG"));
        return albums;
    }

}
