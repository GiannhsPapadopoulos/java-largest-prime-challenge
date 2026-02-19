public class LargestPrime {
    // write code here
    public static int getLargestPrime(int number) {

        if (number <= 1) {
            return -1;
        }

        int factor;
        int maxFactor = -1;

        for (int i = 2; i <= number; i++) {

            if (number % i == 0) { // brisko toys diairetes poy diairoun akrivos ton arithmo.
                factor = i;
                int count = 0;

                for (int j = 1; j <= factor; j++) {

                    if (factor % j == 0) {
                        count++;
                    }
                }

                if (count == 2) {
                    maxFactor = i;
                }
            }
        }

        return maxFactor;
    }
}