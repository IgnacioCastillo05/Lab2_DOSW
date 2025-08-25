package edu.dosw.lab.util.Reto7;

public class Music {
    private boolean isPlaying = false;
    private int volume = 0;

    public void play(){
        isPlaying = true;
    }

    public void stop(){
        isPlaying = false;
    }

    public void setVolume(int volume){
        this.volume = volume;
    }

    public int getVolume(){
        return volume;
    }
}
