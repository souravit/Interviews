package SlidingWindow;

import java.util.LinkedList;

public class First_negative_integer_in_every_Window_of_size_K {
    public static void main(String[] args) {
        int a[] = {12, -1, -7, 8, -15, 30, 16, 28};
        int k = 3;
        helper(a,k);
    }

    private  static void helper(int a[],int k){
        LinkedList<Integer> list = new LinkedList<>();
        int i = 0, j = 0;
        while(j < a.length){
            if(a[j] < 0){
                list.add(a[j]);
            }
            if(j - i + 1 < k){
                j++;
            } else if (j - i + 1 == k ) {
                if(list.isEmpty()){
                    System.out.println(0);
                }
                else if(a[i] == list.peekFirst()){
                    System.out.println(list.peekFirst());
                    list.removeFirst();
                }else{
                    System.out.println(list.peekFirst());
                }
                i++;
                j++;
            }
        }
    }
}
