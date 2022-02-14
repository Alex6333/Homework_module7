public class PlayerCD extends MusicPlayer implements Soundable{
    @Override
    void playbackMusic() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Playing from CD";
    }

    @Override
    public void sound() {
        System.out.println("Push the button to have a music");
    }
}
