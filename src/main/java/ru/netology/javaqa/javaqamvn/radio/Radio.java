package ru.netology.javaqa.javaqamvn.radio;

public class Radio {
    private int quantityStations = 10;
    private int maxNumberStation = quantityStations - 1;
    private int minNumberStation = 0;
    private int currentNumberRadioStation = minNumberStation;
    private int maxSoundVolume = 100;
    private int minSoundVolume = 0;
    private int currentSoundVolume = minSoundVolume;

    public Radio(int quantityStations) {
        if (quantityStations > 0) {
            this.quantityStations = quantityStations;
            this.maxNumberStation = quantityStations - 1;
        } else {
            System.out.println("Количество радиостанций не может быть меньше 1");
        }
    }

    public Radio() {
    }

    public int getCurrentNumberRadioStation() {

        return currentNumberRadioStation;
    }

    public int getMaxNumberRadioStation() {

        return maxNumberStation;
    }

    public int getMinNumberRadioStation() {

        return minNumberStation;
    }

    public void setCurrentNumberRadioStation(int newCurrentNumberRadioStation) {
        if (newCurrentNumberRadioStation < minNumberStation) {
            return;
        }
        if (newCurrentNumberRadioStation > maxNumberStation) {
            return;
        }
        currentNumberRadioStation = newCurrentNumberRadioStation;
    }

    public void setPrevNumberRadioStation() {
        if (currentNumberRadioStation == 0) {
            currentNumberRadioStation = maxNumberStation;
        } else {
            currentNumberRadioStation--;
        }
    }

    public void setNextNumberRadioStation() {
        if (currentNumberRadioStation == maxNumberStation) {
            currentNumberRadioStation = 0;
        } else {
            currentNumberRadioStation++;
        }
    }

    public int getCurrentSoundVolume() {
        return currentSoundVolume;
    }

    public void setPlusSoundVolume() {
        if (currentSoundVolume < maxSoundVolume) {
            currentSoundVolume++;
        }
    }

    public void setMinusSoundVolume() {
        if (currentSoundVolume > minSoundVolume) {
            currentSoundVolume--;
        }
    }
}
