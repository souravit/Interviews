package BinarySearch;
/*
Simple binary Seach application
 */
public class SearchUnknown {
    public static void main(String[] args) {
        int reader[] = {-1,0,3,5,9,12};
        int target = 5;
        System.out.println(search(reader,target));
    }

    public static int search(int[] reader, int target) {
        int low = 0, high = 1;
        while(reader[high] < target){
            low = high;
            high = high * 2;
        }
        return binarySearch(low, high, reader, target);
    }

    public static int binarySearch(int low, int high, int[] reader, int target){
        while(low <= high){
            int mid = (low + high)/2;
            if(reader[mid] == target) return mid;
            if(target < reader[mid]){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return -1;
    }


}
