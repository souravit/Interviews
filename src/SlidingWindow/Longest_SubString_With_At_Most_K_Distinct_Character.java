package SlidingWindow;

import java.util.HashMap;

public class Longest_SubString_With_At_Most_K_Distinct_Character {
    public static void main(String[] args) {
        String s = "aabacbebebe";
        int k = 3;
        helper(s,k);
    }

    private static void helper(String s, int k) {
        if(k==0) {
            System.out.println(0);
        }
        int i = 0, j = 0, max = Integer.MIN_VALUE;
        HashMap<Character, Integer> map = new HashMap<>();
        while(j < s.length()){
            map.put(s.charAt(j),map.getOrDefault(s.charAt(j), 0)+ 1);
            if(map.size() <= k){
                max = Math.max(max, j - i + 1);
            } else if (map.size() > k) {
                while(map.size() > k){
                    map.put(s.charAt(i),map.getOrDefault(s.charAt(i), 0)-1);
                    if(map.get(s.charAt(i))==0){
                        map.remove(s.charAt(i));
                    }
                    i++;
                }
            }
            j++;
        }
        System.out.println(max);
    }

}
