package nivelmedio10;

public class SecondsToHoursMinuteAndSeconds04 {
    //Manipule int types
    //Given total seconds( e.g.,int totalSeconds = 7265;), convert end print it in the format 2 hours, 59 minute, and 59 seconds.
    public static void main(String[] args) {
        int totalSeconds = 7265; // Example input
        int hours = totalSeconds / 3600; // Calculate hours
        int minutes = (totalSeconds % 3600) / 60; // Calculate minutes
        int seconds = totalSeconds % 60; // Calculate remaining seconds

        System.out.printf("%d hours, %d minutes, and %d seconds%n", hours, minutes, seconds); // placeholders for hours, minutes, and seconds
    }
}