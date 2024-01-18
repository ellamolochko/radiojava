import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radSet = new Radio(35);
    Radio radBasic = new Radio();

    @Test
    public void nextStation() {
        radBasic.setCurrentStation(3);
        radBasic.next();
        Assertions.assertEquals(4, radBasic.getCurrentStation());

        radSet.setCurrentStation(27);
        radSet.next();
        Assertions.assertEquals(28, radSet.getCurrentStation());
    }

    @Test
    public void nextStation0() {
        radBasic.setCurrentStation(9);
        radBasic.next();
        Assertions.assertEquals(0, radBasic.getCurrentStation());

        radSet.setCurrentStation(34);
        radSet.next();
        Assertions.assertEquals(0, radSet.getCurrentStation());
    }

    @Test
    public void prevStation() {
        radBasic.setCurrentStation(3);
        radBasic.prev();
        Assertions.assertEquals(2, radBasic.getCurrentStation());

        radSet.setCurrentStation(27);
        radSet.prev();
        Assertions.assertEquals(26, radSet.getCurrentStation());
    }

    @Test
    public void prevStationLast() {
        radBasic.setCurrentStation(0);
        radBasic.prev();
        Assertions.assertEquals(9, radBasic.getCurrentStation());

        radSet.setCurrentStation(0);
        radSet.prev();
        Assertions.assertEquals(34, radSet.getCurrentStation());
    }

    @Test
    public void chooseStation() {
        radBasic.setCurrentStation(3);
        Assertions.assertEquals(3, radBasic.getCurrentStation());

        radSet.setCurrentStation(27);
        Assertions.assertEquals(27, radSet.getCurrentStation());
    }

    @Test
    public void chooseStationOver() {
        radBasic.setCurrentStation(30);
        Assertions.assertEquals(0, radBasic.getCurrentStation());

        radSet.setCurrentStation(50);
        Assertions.assertEquals(0, radSet.getCurrentStation());
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
        radBasic.setCurrentVolume(25);
        radBasic.increaseVolume();
        Assertions.assertEquals(26, radBasic.getCurrentVolume());
    }

    @Test
    public void increaseVolumeHigh() {
        radBasic.setCurrentVolume(100);
        radBasic.increaseVolume();
        Assertions.assertEquals(100, radBasic.getCurrentVolume());
    }

    @Test
    public void increaseVolume100() {
        radBasic.setCurrentVolume(108);
        radBasic.increaseVolume();
        Assertions.assertEquals(1, radBasic.getCurrentVolume());
    }

    @Test
    public void lowerVolume() {
        radBasic.setCurrentVolume(7);
        radBasic.lowerVolume();
        Assertions.assertEquals(6, radBasic.getCurrentVolume());
    }

    @Test
    public void lowerVolume0() {
        radBasic.setCurrentVolume(-5);
        radBasic.lowerVolume();
        Assertions.assertEquals(0, radBasic.getCurrentVolume());
    }

}