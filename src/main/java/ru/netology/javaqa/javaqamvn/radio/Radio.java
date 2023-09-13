package ru.netology.javaqa.javaqamvn.radio;

import lombok.*;

public @Data class Radio {
    @NonNull
    private int quantityStations = 10;
    @Getter
    @NonNull
    private int maxNumberStation = quantityStations - 1;
    @Getter
    private int minNumberStation = 0;
    @Getter
    private int currentNumberRadioStation = minNumberStation;
    @NonNull
    private int maxSoundVolume = 100;
    private int minSoundVolume = 0;
    @Getter
    private int currentSoundVolume = minSoundVolume;

    public Radio(int quantityStations) {
        this.quantityStations = quantityStations;
        this.maxNumberStation = quantityStations - 1;
    }

    public Radio() {
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
