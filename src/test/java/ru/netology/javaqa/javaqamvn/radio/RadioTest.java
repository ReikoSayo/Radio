package ru.netology.javaqa.javaqamvn.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldSetQuantityRadioStations() {

        Radio radio = new Radio(15);

        Assertions.assertEquals(14, radio.getMaxNumberStation());
    }

    Radio radio = new Radio();

    @Test
    public void shouldSetNumberRadioStation() {

        radio.setCurrentNumberRadioStation(5);

        int expected = 5;
        int actual = radio.getCurrentNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxNumberRadioStation() {

        int expected = 9;
        int actual = radio.getMaxNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMinNumberRadioStation() {

        int expected = 0;
        int actual = radio.getMinNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetNumberRadioStationAboveMax() {

        radio.setCurrentNumberRadioStation(15);

        int expected = 0;
        int actual = radio.getCurrentNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetNumberRadioStationBelowMin() {

        radio.setCurrentNumberRadioStation(-1);

        int expected = 0;
        int actual = radio.getCurrentNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToPrevNumberRadioStationFromMin() {

        radio.setPrevNumberRadioStation();

        int expected = 9;
        int actual = radio.getCurrentNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToPrevNumberRadioStationFromMax() {

        radio.setCurrentNumberRadioStation(9);
        radio.setPrevNumberRadioStation();

        int expected = 8;
        int actual = radio.getCurrentNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToPrevNumberRadioStationFromMiddle() {

        radio.setCurrentNumberRadioStation(5);
        radio.setPrevNumberRadioStation();

        int expected = 4;
        int actual = radio.getCurrentNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToNextNumberRadioStationFromMin() {

        radio.setNextNumberRadioStation();

        int expected = 1;
        int actual = radio.getCurrentNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToNextNumberRadioStationFromMax() {

        radio.setCurrentNumberRadioStation(9);
        radio.setNextNumberRadioStation();

        int expected = 0;
        int actual = radio.getCurrentNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToNextNumberRadioStationFromMiddle() {

        radio.setCurrentNumberRadioStation(5);
        radio.setNextNumberRadioStation();

        int expected = 6;
        int actual = radio.getCurrentNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetToMinusSoundVolumeFromMin() {

        radio.setMinusSoundVolume();

        int expected = 0;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMinusSoundVolumeFromNotNull() {

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

        radio.setPlusSoundVolume();

        int expected = 1;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetToPlusSoundVolumeAboveMax() {

        for (int i = 0; i < 102; i++) {
            radio.setPlusSoundVolume();
        }

        int expected = 100;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

}
