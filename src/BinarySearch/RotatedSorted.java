package BinarySearch;
/*
First concept is how to find the mid element
mid = (low + high) / 2;

Binary search always work on the sorted array ,So we need to identify the which side of the array is sorted and which
side is not sorted and after identity the side we need to figure it out where the target lies and where it doesn't
so overal all it os good expeereince solving he code
 */
public class RotatedSorted {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(helper(nums, target));

    }

    private static int helper(int[] nums, int target) {
        if(nums == null || nums.length == 0) return 0;

        int length = nums.length;
        int low = 0, high = length - 1;
        while(low <= high){
            int mid = (low + high)/2;
            if(nums[mid] == target) return mid;
            if(nums[low] <= nums[mid]){
                if(nums[low] <= target && target <= nums[mid]){
                    high = mid - 1;
                }else{
                    low = mid + 1;
                }
            }else{
                if(nums[mid] <= target && target <= nums[high]){
                    low = mid + 1;
                }else{
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}
