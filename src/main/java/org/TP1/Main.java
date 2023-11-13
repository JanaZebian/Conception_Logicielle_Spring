package org.TP1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SongConfig.class);
        SongService songService = applicationContext.getBean(SongService.class);

        songService.getSongs();
    }
}