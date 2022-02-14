import java.util.Arrays;

public class MusicShop {

    Object[] objects;

    public MusicShop() {
        objects = new Object[3];

        objects[0] = new PlayerCD();
        objects[1] = new PlayerMP3();
        objects[2] = new PlayerTape();
    }

    @Override
    public String toString() {
        return "MusicShop: " +
                Arrays.toString(objects);
    }

    public void playMusic() {
        for (Object a : objects) {
            System.out.println(a);
        }
    }

    public void sound() {
        for (Object a: objects) {
            if (a instanceof Soundable) {
                ((Soundable)a).sound();
            }
        }
    }
}
