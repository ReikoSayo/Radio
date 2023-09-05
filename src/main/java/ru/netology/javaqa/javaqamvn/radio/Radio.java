package ru.netology.javaqa.javaqamvn.radio;

public class Radio {
    private int currentNumberRadioStation;
    private int currentSoundVolume;

    public int getCurrentNumberRadioStation() {
        return currentNumberRadioStation;
    }

    public void setCurrentNumberRadioStation(int newCurrentNumberRadioStation) {
        if (newCurrentNumberRadioStation < 0) {
            return;
        }
        if (newCurrentNumberRadioStation > 9) {
            return;
        }
        currentNumberRadioStation = newCurrentNumberRadioStation;
    }

    public void setPrevNumberRadioStation() {
        if (currentNumberRadioStation == 0) {
            currentNumberRadioStation = 9;
        } else {
            currentNumberRadioStation--;
        }
    }

    public void setNextNumberRadioStation() {
        if (currentNumberRadioStation == 9) {
            currentNumberRadioStation = 0;
        } else {
            currentNumberRadioStation++;
        }
    }

    public int getCurrentSoundVolume() {
        return currentSoundVolume;
    }

    public void setPlusSoundVolume() {
        if (currentSoundVolume < 100) {
            currentSoundVolume++;
        }
    }

    public void setMinusSoundVolume() {
        if (currentSoundVolume > 0) {
            currentSoundVolume--;
        }
    }
}
