package org.example;

public class Radio {
    private int sound;
    private int maxStationNumber = 9;
    private int minStationNumber = 0;
    private int stationNumber = minStationNumber;
    public Radio() {

    }
    public Radio(int size) {
        maxStationNumber = minStationNumber + size;
    }
    public int getStationNumber () {
        return stationNumber;
    }
    public int getMaxStationNumber () {
        return maxStationNumber;
    }
    public int getMinStationNumber () {
        return minStationNumber;
    }
    public void setStationNumber (int newStationNumber) {
        if (newStationNumber < minStationNumber) {
            return;
        }
        if (newStationNumber > maxStationNumber) {
            return;
        }
        stationNumber = newStationNumber;
    }
    public void nextStationNumber () {
        if (stationNumber < maxStationNumber) {
            stationNumber = stationNumber + 1;
        } else {
            stationNumber = minStationNumber;
        }
    }
    public void prevStationNumber () {
        if (stationNumber > minStationNumber) {
            stationNumber = stationNumber - 1;
        } else {
            stationNumber = maxStationNumber;
        }
    }

    public int getSound () {

        return sound;
    }
    public int getMaxSound () {
        return 100;
    }
    public int getMinSound () {
        return 0;
    }
    public void setSound (int newSound) {
        if (newSound < 0) {
            return;
        }
        if (newSound > 100) {
            return;
        }
        sound = newSound;
    }
    public void setMaxSound () {

        sound = 100;
    }
    public void setMinSound () {

        sound = 0;
    }
    public void increaseSound() {
        if (sound < 100) {
            sound = sound + 1;
        }
    }
    public void decreaseSound() {
        if (sound > 0) {
            sound = sound - 1;
        }
    }
}
