import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void nextStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(7);
        rad.next();

        int expected = 8;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(7);
        rad.prev();

        int expected = 6;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void chooseStation() {
        Radio rad = new Radio();

        rad.setCurrentStation(7);

        int expected = 7;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(25);

        rad.increaseVolume();

        int expected = 26;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void lowerVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(7);
        rad.lowerVolume();

        int expected = 6;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}