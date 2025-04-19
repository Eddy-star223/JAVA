public class ClockTest {
public static void main(String[] args) {

Clock myClock = new Clock(23, 59, 59);


System.out.printf("%dhh: %dmm: %dss", myClock.getHour(), myClock.getMinute(), myClock.getSecond());

}
}