package com.devonSongr.helloWorld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller


public class helloController {

    @ResponseBody
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getHome(){
        return "hello world";

    }

    @GetMapping("/hello")
    public String getHello(Model m){
        m.
        return "hello";
    }

    @GetMapping("/capitalize/{word}")
    public String capitalize(@PathVariable String word){
        return word.toUpperCase();
    }
}
