package DynamicProgramming;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Knapsack_Subset_sum_Memoization {

    public static void main(String[] args) {
        int[] s = {3, 34, 4, 12, 5, 2};
        int k = 31;
        System.out.println(subsetSum(s,s.length,k));
    }
    static int subsetSum(int a[], int n, int sum)
    {
        // Storing the value -1 to the matrix
        int tab[][] = new int[n + 1][sum + 1];
        for(int row[] : tab){
            Arrays.fill(row , -1);
        }

        // If the sum is zero it means
        // we got our expected sum
        if (sum == 0)
            return 1;

        if (n <= 0)
            return 0;

        // If the value is not -1 it means it
        // already call the function
        // with the same value.
        // it will save our from the repetition.
        if (tab[n - 1][sum] != -1)
            return tab[n - 1][sum];

        // if the value of a[n-1] is
        // greater than the sum.
        // we call for the next value
        if (a[n - 1] > sum)
            return tab[n - 1][sum]
                    = subsetSum(a, n - 1, sum);
        else {

            // Here we do two calls because we
            // don't know which value is
            // full-fill our criteria
            // that's why we doing two calls
            if (subsetSum(a, n - 1, sum) != 0
                    || subsetSum(a, n - 1, sum - a[n - 1])
                    != 0) {
                return tab[n - 1][sum] = 1;
            }
            else
                return tab[n - 1][sum] = 0;
        }
    }
}
