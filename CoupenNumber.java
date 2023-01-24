package Day6;

import java.util.HashSet;
import java.util.Random;

public class CoupenNumber {
    public static int generateRandom() {
        Random rand = new Random();
        return rand.nextInt(1000);
    }

    public static int processCoupons(int n) {
        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        while (set.size() < n) {
            int random = generateRandom();
            count++;
            set.add(random);
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 10;
        int totalRandom = processCoupons(n);
        System.out.println("Total random numbers needed: " + totalRandom);
    }
}
