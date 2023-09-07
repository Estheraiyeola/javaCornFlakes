package corn_flakes;

public class MinuteSecond {
    private int minute;
    private int seconds;
    private int days;
    private int years;

    public void setMinute1(int minute){
        if (minute > 0) {
            seconds = minute * 60;
        }
    }
    public int getSecond(){
        return seconds;
    }

    public void setMinutes2(int minute) {
        if (minute > 0) {
            days = minute / (24 * 60);
        }
    }

    public int getDays() {
        return days;
    }

    public void setMinute3(int minute) {
        if (minute > 0) {
            years = minute / (60 * 24 * 365);
        }
    }

    public int getYears() {
        return years;
    }
}
