public class PlayerMP3 extends MusicPlayer implements Soundable{
    @Override
    void playMusic() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Playing MP3";
    }

    @Override
    public void sound() {
        System.out.println("Push the button to have a music");
    }
}
