package com.music;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Aleksei Chursin
 */


public class MusicPlayer {


    private List<Music> musicList = new ArrayList<>();
    private int volume;
    private String Name;

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void playMusicList(){
        for (Music music : musicList){
            System.out.println("Playing "+ music.getSong());
        }
    }
}
