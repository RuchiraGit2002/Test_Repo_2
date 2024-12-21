import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] randomNumbers = new int[5];
        Random random = new Random();

        // Sets each element to a random value between 0 and 99
        Arrays.setAll(randomNumbers, i -> random.nextInt(100));

        System.out.println(Arrays.toString(randomNumbers));// Output: [e.g., 12, 47, 86, 33, 5]

        System.out.println("Ohhhhh nooo");
    }
}


