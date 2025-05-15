public class Clock {

private int hour;
private int minute;
private int second;

public Clock(int hour, int minute, int second) {
this.hour = hour;
this.minute = minute;
this.second = second;

} 

public void sethour(int hour) {
if (hour > 23) {
hour = 0;
}
}

public int getHour() {
return hour;
}

public void setMinute(int minute) {
if (minute > 59) {
minute = 0;
}
}

public int getMinute() {
return minute;
}

public void setSecond(int second) {
if (second > 59) {
second = 0;
}
}

public int getSecond() {
return second;
}


}