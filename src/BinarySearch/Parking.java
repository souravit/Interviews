package BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Parking {
    public static void main(String[] args) {
        List<Long> x = new ArrayList<Long>(Arrays.asList(2L, 10L,8L,17L));
        int k = 3;
        System.out.println(carParkingRoof(x,k));
    }

    public static long carParkingRoof(List<Long> cars, int k) {
        // Write your code here
        if (cars.size() == 0 || k < 0) {
            return 0;
        }

        Collections.sort(cars);
        long minDist = Long.MAX_VALUE;

        for (int i = 0; i <= cars.size() - k; i++) {
            long x = cars.get(i + k - 1);
            long y = cars.get(i);
            minDist = Math.min(minDist, cars.get(i + k - 1) - cars.get(i));
        }

        return minDist + 1;
    }
}
