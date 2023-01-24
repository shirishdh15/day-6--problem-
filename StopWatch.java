package Day6;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class StopWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press enter to start the stopwatch:");
        scanner.nextLine();
        Instant start = Instant.now();
        System.out.println("Stopwatch started!");
        System.out.println("Press enter to stop the stopwatch:");
        scanner.nextLine();
        Instant end = Instant.now();
        Duration elapsed = Duration.between(start, end);
        System.out.println("Stopwatch stopped!");
        System.out.println("Elapsed time: " + elapsed.toMillis() + " milliseconds");
        scanner.close();
    }
}