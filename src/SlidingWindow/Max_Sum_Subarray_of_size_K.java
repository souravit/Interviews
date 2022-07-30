package SlidingWindow;

public class Max_Sum_Subarray_of_size_K {
    public static void main(String[] args) {
        int a[] ={2,4,5,2,1,6,8,9};
        int windowSize = 3;

        System.out.println(helper(a,windowSize));
    }

    private static int helper(int a[], int k){
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int i=0, j=0;
        while(j < a.length){
            sum += a[j];
            if(j - i + 1 < k){
                j++;
            }
            else if(j - i + 1 == k){
                max = Math.max(max,sum);
                sum = sum - a[i];
                j++;
                i++;
            }
        }
        return max;
    }
}
