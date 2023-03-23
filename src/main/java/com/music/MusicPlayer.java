package com.music;

public class MusicPlayer {

    private int volume;
    private String Name;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    private Music music;

    //IoC, empty constructor needed:
    public MusicPlayer(){ }
    public MusicPlayer(Music music){ this.music = music; }

    //needs to start with "set":
    public void setMusic(Music music){ this.music = music; }

    public void playMusic(){
        System.out.println("Playing: " + music.getSong());
    }
}
