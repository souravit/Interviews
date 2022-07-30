package Recussion;

public class HouseRobber {
    public static void main(String[] args) {
        int a[] = {2,1,1,2};
        // int n = a.length;
        System.out.println(helper(a,0,0));
    }

    private static int helper(int[] a, int index, int max) {
        //base
        if(index>= a.length)
            return max;

        //Choice diagram
        //Not to select
        int notSelect = helper(a,index+1,max);
        //To Select
        int select = helper(a,index+2,max+a[index]);
        /*
        over here we will be adding in max only a[index] value
         */

        return Math.max(notSelect,select);
    }
}
