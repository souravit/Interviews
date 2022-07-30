package DynamicProgramming;

public class Knapsack_Subset_Sum_Recussion {
    public static void main(String[] args) {
        int[] s = {3, 34, 4, 12, 5, 2};
        int k = 31;
        System.out.println(helper(s,k,s.length));
    }

    private static boolean helper(int[] s, int k, int length) {
        //base
       if(k == 0) return  true;
       if(length == 0) return false;
        //choice diagram
        if(s[length - 1] <= k){
            return helper(s,k - s[length - 1], length - 1) || helper(s, k, length -1);
        }else{
            return helper(s, k, length -1);
        }
    }
}
