package by.markov.basic.lineprograms.fifth;

public class TimeOfUser {

    final int HOUR_IN_SECONDS = 3600;
    final int MINUTE_IN_SECONDS = 60;

    public void getFormatTime(int timeInSeconds) {
        int hours = timeInSeconds / HOUR_IN_SECONDS;
        int minutes = (timeInSeconds % HOUR_IN_SECONDS) / MINUTE_IN_SECONDS;
        int seconds = ((timeInSeconds % HOUR_IN_SECONDS) % MINUTE_IN_SECONDS);
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}
