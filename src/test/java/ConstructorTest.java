import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConstructorTest {

    @Test
    public void test() {
        Radio radio = new Radio(25);

        radio.setCurrentStation(15);

        int expected = 15;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSwitchToNextStation() {
        Radio radio = new Radio(26);

        radio.setCurrentStation(15);

        radio.next();

        int expected = 16;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToStationTwentyFive() {
        Radio radio = new Radio(26);

        radio.setCurrentStation(24);

        radio.next();

        int expected = 25;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToStationZero() {
        Radio radio = new Radio(26);

        radio.setCurrentStation(25);

        radio.next();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToPrevStation() {
        Radio radio = new Radio(26);

        radio.setCurrentStation(15);

        radio.prev();

        int expected = 14;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToPrevStationZero() {
        Radio radio = new Radio(26);

        radio.setCurrentStation(1);

        radio.prev();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToPrevStationTwentyFive() {
        Radio radio = new Radio(26);

        radio.setCurrentStation(0);

        radio.prev();

        int expected = 25;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnDownVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);

        radio.turnDownVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeStayTheSame() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldStayTheZero() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.turnDownVolume();

        int expected = 00;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
