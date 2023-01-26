package com.devonSongr.helloWorld;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller


public class albumController {

    @GetMapping("/albums")
    public String getAlbums(Model m){
        m.addAttribute("");
        return "albums";
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
