public class Multiples {
    public static void main(String[] args) {
        int number = 12;
        int limit = 10;

        for (int i = 1; i <= limit; i++) {
            int result = number * i;
            System.out.println(number + " x " + i + " = " + result);
        }
    }
}
