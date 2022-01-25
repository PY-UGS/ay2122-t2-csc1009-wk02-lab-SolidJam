public class Q3 {
    public static void main(String[] args) {
        long totalSeconds = System.currentTimeMillis()/1000;
        System.out.println(totalSeconds);
        long currentSeconds = totalSeconds % 60;
        System.out.println(currentSeconds);
        long totalMinute = totalSeconds / 60;
        System.out.println(totalMinute);
        long currentMinutes = totalMinute % 60;
        System.out.println(currentMinutes);
        long totalHours = totalMinute / 60;
        System.out.println(totalHours);
        long currentHour = totalHours % 60;
        System.out.println(currentHour);

        System.out.println("Current time is " + currentHour + ":" + currentMinutes + ":" + currentSeconds + " GMT" );
    }

}
