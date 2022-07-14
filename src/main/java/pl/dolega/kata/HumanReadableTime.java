package pl.dolega.kata;

public class HumanReadableTime {

    public static String makeReadable(int seconds) {
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        seconds = seconds - (hours * 3600 + minutes * 60);
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }
}
