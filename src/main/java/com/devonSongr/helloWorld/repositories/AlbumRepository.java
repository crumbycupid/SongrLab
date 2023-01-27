package com.devonSongr.helloWorld.repositories;

import com.devonSongr.helloWorld.models.Album;
import org.springframework.data.jpa.repository.JpaRepository;

//make repo for the data value. This is a service - singleton design principle == spring.bean!
//using an interface to create custom CRUD query
public interface AlbumRepository extends JpaRepository<Album, Long> {
    Album findByTitle(String title);
    Album findByArtist(String artist);
    Album findBySongCount(Integer songCount);
}