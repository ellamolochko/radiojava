public class Radio {
    private final int minVolume = 0;
    private final int maxVolume = 100;
    private int currentVolume = minVolume;
    private final int minStation = 0;
    private int maxStation = 9;
    private int currentStation = minStation;

    public Radio() {

    }

    public Radio(int sizeStation) {
        maxStation = sizeStation - 1;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < minStation) {
            return;
        }
        if (newCurrentStation > maxStation) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void lowerVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }

    public void next() {
        if (currentStation < maxStation) {
            currentStation = currentStation + 1;
        } else {
            currentStation = minStation;
        }
    }

    public void prev() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        } else {
            currentStation = maxStation;
        }
    }
}