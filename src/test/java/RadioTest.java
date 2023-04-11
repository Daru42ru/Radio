import org.example.Radio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldSizeStation () {
        Radio cond = new Radio(29);
        Assertions.assertEquals(29, cond.getMaxStationNumber());
        Assertions.assertEquals(0, cond.getMinStationNumber());
        Assertions.assertEquals(0, cond.getStationNumber());
    }
    @Test
    public void shouldSetStationNumber () {
        Radio cond = new Radio();
        cond.setStationNumber(6);
        int expected = 6;
        int actual = cond.getStationNumber ();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNotSetAboveMax () {
        Radio cond = new Radio();
        cond.setStationNumber(10);
        int expected = 0;
        int actual = cond.getStationNumber ();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNotSetBelowMin () {
        Radio cond = new Radio();
        cond.setStationNumber(-1);
        int expected = 0;
        int actual = cond.getStationNumber ();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetNextStation () {
        Radio cond = new Radio();
        cond.setStationNumber(0);
        cond.nextStationNumber();
        int expected = 1;
        int actual = cond.getStationNumber ();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetNextStationIfMax () {
        Radio cond = new Radio();
        cond.setStationNumber(9);
        cond.nextStationNumber();
        int expected = 0;
        int actual = cond.getStationNumber ();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetPrevStation () {
        Radio cond = new Radio();
        cond.setStationNumber(9);
        cond.prevStationNumber ();
        int expected = 8;
        int actual = cond.getStationNumber ();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetPrevStationIfMin () {
        Radio cond = new Radio();
        cond.setStationNumber(0);
        cond.prevStationNumber ();
        int expected = 9;
        int actual = cond.getStationNumber ();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetSound () {
        Radio cond = new Radio();
        cond.setSound(60);
        int expected = 60;
        int actual = cond.getSound ();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNotSetSoundAboveMax () {
        Radio cond = new Radio();
        cond.setSound(120);
        int expected = 0;
        int actual = cond.getSound ();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNotSetSoundBelowMin () {
        Radio cond = new Radio();
        cond.setSound(-5);
        int expected = 0;
        int actual = cond.getSound ();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetIncreaseSound () {
        Radio cond = new Radio();
        cond.setSound(25);
        cond.increaseSound ();
        int expected = 26;
        int actual = cond.getSound ();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetIncreaseSoundIfMax () {
        Radio cond = new Radio();
        cond.setSound(100);
        cond.increaseSound ();
        int expected = 100;
        int actual = cond.getSound ();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetDecreaseSound () {
        Radio cond = new Radio();
        cond.setSound(25);
        cond.decreaseSound ();
        int expected = 24;
        int actual = cond.getSound ();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetDecreaseSoundIfMin () {
        Radio cond = new Radio();
        cond.setSound(0);
        cond.decreaseSound ();
        int expected = 0;
        int actual = cond.getSound ();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetMaxSound () {
        Radio cond = new Radio();
        cond.setMaxSound();
        int expected = 100;
        int actual = cond.getSound ();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetMinSound () {
        Radio cond = new Radio();
        cond.setMinSound();
        int expected = 0;
        int actual = cond.getSound ();
        Assertions.assertEquals(expected, actual);
    }
}
