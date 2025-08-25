package edu.dosw.lab.util.Reto7;

public class PlayMusicCommand implements Command {
    private Music music;

    public PlayMusicCommand(Music music){
        this.music = music;
    }
    
    @Override
    public void execute(){
        music.play();
    }

    @Override
    public void undo(){
        music.stop();
    }

    @Override
    public String getDescription(){
        return "Reproducir música";
    }
}
