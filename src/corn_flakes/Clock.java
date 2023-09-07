package corn_flakes;

public class Clock {
    private int second;
    private int minute;
    private int hour;
    
    public void setSecond(int second) {
        if (second >= 60){
            if (second >= 86400){
                minute = 0;
                hour = 0;
            }
            else {
                hour = second / (60 * 60);
                int minute_clone = second / 60;
                minute = minute_clone % 60;
            }
        }
        else if (second > 0 && second < 60){
            this.second = second;
        }
        else {
            System.out.println("I don't go back in time. Please put positive numbers!");
        }
    }
    public int getSecond(){
       return second;
    }

    public void setMinute(int minute){
        if (minute >= 60){
            if (minute >= 1440){
                hour = minute / 24;
            }
            else {
                hour = minute / 60;
                this.minute = minute % 60;
            }
        } else if (minute > 0 && minute < 60){
            this.minute = minute;
        }
        else {
            System.out.println("I don't go back in time. Please put positive numbers!"
            );
        }
    }
    public int getMinute(){
        return minute;
    }

    public void setHour(int hour){
        if (hour >= 0 && hour < 24){
            this.hour = hour;
        }
    }

    public int getHour(){
        return hour;
    }



}
