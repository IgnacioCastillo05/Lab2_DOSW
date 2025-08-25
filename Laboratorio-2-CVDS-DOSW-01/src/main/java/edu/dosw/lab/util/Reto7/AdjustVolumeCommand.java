package edu.dosw.lab.util.Reto7;

public class AdjustVolumeCommand implements Command {
    private Music music;
    private int volume;
    private int previousVolume;

    public AdjustVolumeCommand(Music music, int volume){
        this.music = music;
        this.volume = volume;
    }

    @Override
    public void execute() {
        previousVolume = music.getVolume();
        music.setVolume(volume);
    }

    @Override
    public void undo() {
        music.setVolume(previousVolume);
    }

    @Override
    public String getDescription() {
        return "Ajustar volumen a " + volume + "%";
    }
}
