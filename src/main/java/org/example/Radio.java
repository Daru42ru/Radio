package org.example;

public class Radio {
    private int stationNumber;
    public int getStationNumber () {
        return stationNumber;
    }
    public void setStationNumber (int newStationNumber) {
        if (newStationNumber < 0) {
            return;
        }
        if (newStationNumber > 9) {
            return;
        }
        stationNumber = newStationNumber;
    }
    public void nextStationNumber () {
        if (stationNumber < 9) {
            stationNumber = stationNumber + 1;
        } else {
            stationNumber = 0;
        }
    }
    public void prevStationNumber () {
        if (stationNumber > 0) {
            stationNumber = stationNumber - 1;
        } else {
            stationNumber = 9;
        }
    }
    private int sound;
    public int getSound () {
        return sound;
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
