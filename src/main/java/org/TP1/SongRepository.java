package org.TP1;

import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class SongRepository {
    public static final List<Song> Songs = Arrays.asList(
            new Song("Heart on Fire in Mexico",204,"Abby Anderson" ),
            new Song("Notes pour trop tard", 511,"Orelsan")
    );

    public List<Song> getSongs(){
        return SongRepository.Songs;
    }
}
