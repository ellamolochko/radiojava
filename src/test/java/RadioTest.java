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
    public void nextStation0() {
        Radio rad = new Radio();
        rad.setCurrentStation(9);
        rad.next();

        int expected = 0;
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
    public void prevStation9() {
        Radio rad = new Radio();
        rad.setCurrentStation(0);
        rad.prev();

        int expected = 9;
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
    public void chooseStationOver() {
        Radio rad = new Radio();

        rad.setCurrentStation(90);

        int expected = 0;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void chooseStationLower() {
        Radio rad = new Radio();

        rad.setCurrentStation(-90);

        int expected = 0;
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
    public void increaseVolume2() {
        Radio rad = new Radio();
        rad.setCurrentVolume(100);

        rad.increaseVolume();

        int expected = 100;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume100() {
        Radio rad = new Radio();
        rad.setCurrentVolume(108);

        rad.increaseVolume();

        int expected = 1;
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

    @Test
    public void lowerVolume0() {
        Radio rad = new Radio();
        rad.setCurrentVolume(-5);
        rad.lowerVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}