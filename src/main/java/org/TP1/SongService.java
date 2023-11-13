package org.TP1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongService {
    private final SongRepository songRepository;

    public SongService(SongRepository songRepository) {
        this.songRepository = songRepository;
    }

    public void getSongs(){
        System.out.println("List of Songs: ");
        for(Song song : songRepository.getSongs()){
            System.out.println(song);
        }
    }
}
