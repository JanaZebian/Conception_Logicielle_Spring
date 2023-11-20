package org.TP1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SongRepository {
    public final List<Song> songs;

    public SongRepository(
            @Value("${songs.song1}") String[] song1,
            @Value("${songs.song2}") String[] song2

    ){
        this.songs = List.of(
                new Song(song1[0], Integer.parseInt(song1[1]), song1[2]),
                new Song(song2[0], Integer.parseInt(song2[1]), song2[2])
        );
    }


    public List<Song> getSongs(){
        return this.songs;
    }
}
