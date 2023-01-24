package Day6;

public class ReververseNumber {
    public static void main(String[] args) {
        int num = 12345678, reverse = 0;
        for (; num != 0; num /= 10) {
            int remainder = num % 10;
            reverse = reverse * 10 + remainder;
        }
        System.out.println("Reversed number: " + reverse);
    }
}
