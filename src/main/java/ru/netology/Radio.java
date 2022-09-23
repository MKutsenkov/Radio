package ru.netology;



public class Radio {

    private int currentStation;
    private int currentVolume;
    private int stationsCount;

    // каналы
    public Radio() {
        this.stationsCount = 10;
    }

    public Radio(int stationCount) {
        this.stationsCount = stationCount;
    }

    public void next() {
        if (currentStation < stationsCount - 1) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }
    public void prev() {
        if (currentStation > 0) {
            currentStation--;
        } else {
            currentStation = stationsCount - 1;
        }
    }

    public int getCurrentStation () {
        return currentStation;
    }

    public void setCurrentStation ( int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > stationsCount - 1) {
            return;
        }
        this.currentStation = currentStation;
    }
    // Звук
    public int getCurrentVolume () {
        return currentVolume;
    }

    public void setCurrentVolume ( int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10) {
            return;
        }
        this.currentVolume = currentVolume;
    }
    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }
    public void reduceVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

}
