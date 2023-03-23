package com.music;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {


    private List<Music> musicList = new ArrayList<>();
    private int volume;
    private String Name;

    public List<Music> getMusicList() {
        return musicList;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void playMusicList(){
        for (Music music : musicList){
            System.out.println("Playing "+ music.getSong());
        }
    }
}
