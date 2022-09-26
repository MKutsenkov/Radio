package ru.netology;



public class Radio {

    private int maxStation = 9;
    private int minStation = 0;
    private int currentStation = 9;
    private int maxVolume = 99;
    private int minVolume = 0;
    //private int stationsCount;
    private int currentVolume = 99;

   // private int VolumeCount;


    public Radio() {
        this.maxStation = 9;
        this.maxVolume = 99;
   }


    public Radio(int currentStation) {
        this.maxStation = currentStation - 1;
    }
    public int getCurrentStation() {
        return currentStation;
    }
    public void setCurrentStation(int currentStation) {
        if (currentStation < minStation || currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }
    public void next() { // +station
        if (currentStation == maxStation) {
            this.currentStation = minStation;
        } else {
            this.currentStation = currentStation + 1;
        }
    }

    public void prev() { //  -station
        if (currentStation == minStation) {
            this.currentStation = maxStation;
        } else {
            this.currentStation = currentStation - 1;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume || currentVolume > maxVolume) {
            return;
        } else {
            this.currentVolume = currentVolume;
        }
    }

    public void increaseVolume() { // ++
        if (currentVolume == maxVolume) {
            return;
        }
        this.currentVolume = currentVolume + 1;
    }

    public void reduceVolume() { //  --
        if (currentVolume == minVolume) {
            return;
        }
        this.currentVolume = currentVolume - 1;
    }
}
















