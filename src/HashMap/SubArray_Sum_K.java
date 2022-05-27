package HashMap;

import java.util.HashMap;

public class SubArray_Sum_K {
    public static void main(String[] args) {
        int a[] = {3,4,7,2,-3,1,4,2};
        int target = 7;
        System.out.println(subarraySum(a,target));
    }

    private static int subarraySum(int[] nums, int k) {
        int count = 0 , sum = 0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(0,1);
        for(int i = 0 ; i <= nums.length - 1 ; i++){
            sum += nums[i];
            if(map.containsKey(sum - k)){
                count += map.get(sum - k);
            }
            map.put(sum , map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }

}
