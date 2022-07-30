package SlidingWindow;

import java.util.Deque;
import java.util.LinkedList;

public class Max_of_all_subarray_of_size_K {
    public static void main(String[] args) {
        //int a[] ={1, 3, -1, -3, 5, 3, 6, 7};
        int a[] ={1};

        int k = 1;
        helper(a,k);
    }

    private static void helper(int[] nums, int k) {
        Deque<Integer> d= new LinkedList<>();
        int n = nums.length;
        int[] result = new int[n - k + 1];
        int i = 0, j = 0;
        while (j < nums.length){
            //This picec of code is important
            while(!d.isEmpty() && nums[j] >=d.peek()){
                d.remove();
            }
            d.add(nums[j]);
            if(j - i + 1 < k){
                j++;
            } else if (j - i + 1 == k) {
                System.out.println(d.peek());
                if(d.peek() == nums[i]){
                    d.remove();
                }
                i++;
                j++;
            }

        }
        //System.out.println(d);

//        while(j < nums.length){
//            while(!dq.isEmpty() && nums[j] >= dq.peekLast()){
//                dq.remove();
//            }
//            System.out.println();
//            dq.addLast(nums[i]);
//            System.out.println(dq);
//            if(j - i + 1 < k){
//                j++;
//            }else if(j - i + 1 == k){
//                System.out.println(dq.peek());
//                if(nums[i] == dq.peek()){
//                    dq.remove();
//                }
//                i++;
//                j++;
//            }
//
//        }
//

    }
}
