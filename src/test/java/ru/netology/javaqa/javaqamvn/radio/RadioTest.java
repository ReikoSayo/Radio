package ru.netology.javaqa.javaqamvn.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetNumberRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentNumberRadioStation(5);

        int expected = 5;
        int actual = radio.getCurrentNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxNumberRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentNumberRadioStation(9);

        int expected = 9;
        int actual = radio.getCurrentNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetNumberRadioStationAboveMax() {
        Radio radio = new Radio();

        radio.setCurrentNumberRadioStation(15);

        int expected = 0;
        int actual = radio.getCurrentNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetNumberRadioStationBelowMin() {
        Radio radio = new Radio();

        radio.setCurrentNumberRadioStation(-1);

        int expected = 0;
        int actual = radio.getCurrentNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToPrevNumberRadioStationFromMin() {
        Radio radio = new Radio();

        radio.setPrevNumberRadioStation();

        int expected = 9;
        int actual = radio.getCurrentNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToPrevNumberRadioStationFromMax() {
        Radio radio = new Radio();

        radio.setCurrentNumberRadioStation(9);
        radio.setPrevNumberRadioStation();

        int expected = 8;
        int actual = radio.getCurrentNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToPrevNumberRadioStationFromMiddle() {
        Radio radio = new Radio();

        radio.setCurrentNumberRadioStation(5);
        radio.setPrevNumberRadioStation();

        int expected = 4;
        int actual = radio.getCurrentNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToNextNumberRadioStationFromMin() {
        Radio radio = new Radio();

        radio.setNextNumberRadioStation();

        int expected = 1;
        int actual = radio.getCurrentNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToNextNumberRadioStationFromMax() {
        Radio radio = new Radio();

        radio.setCurrentNumberRadioStation(9);
        radio.setNextNumberRadioStation();

        int expected = 0;
        int actual = radio.getCurrentNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToNextNumberRadioStationFromMiddle() {
        Radio radio = new Radio();

        radio.setCurrentNumberRadioStation(5);
        radio.setNextNumberRadioStation();

        int expected = 6;
        int actual = radio.getCurrentNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetToMinusSoundVolumeFromMin() {
        Radio radio = new Radio();

        radio.setMinusSoundVolume();

        int expected = 0;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMinusSoundVolumeFromNotNull() {
        Radio radio = new Radio();

        for (int i = 0; i < 11; i++) {
            radio.setPlusSoundVolume();
        }

        radio.setMinusSoundVolume();

        int expected = 10;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToPlusSoundVolumeFromMin() {
        Radio radio = new Radio();

        radio.setPlusSoundVolume();

        int expected = 1;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetToPlusSoundVolumeAboveMax() {
        Radio radio = new Radio();

        for (int i = 0; i < 102; i++) {
            radio.setPlusSoundVolume();
        }

        int expected = 100;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

}
