package SlidingWindow;

import java.util.HashMap;

public class Count_Occurance_Anagram {
    public static void main(String[] args) {
        String s = "forxxorfxdofr";
        String p = "for";
        helper(s,p);
    }

    private static void helper(String s, String p) {
        int ans = 0;
        HashMap<Character,Integer> freMap = new HashMap<>();
        for(Character c : p.toCharArray()){
            freMap.put(c, freMap.getOrDefault(c,0)+1);
        }
        //"forxxorfxdofr";
        System.out.println(freMap);
        System.out.println(freMap.size());
        int i = 0, j = 0;
        int count = freMap.size();
        while(j < s.length()){
            if(freMap.containsKey(s.charAt(j))){
                freMap.put(s.charAt(j),freMap.getOrDefault(s.charAt(j),0)-1);
                if(freMap.get(s.charAt(j)) == 0){
                    count--;
                }
            }
            //Window size less than k
            if(j - i + 1 < p.length()){
                j++;
            }
            else if(j - i + 1 == p.length()){
                if(count == 0){
                    ans++;
                }
                if(freMap.containsKey(s.charAt(i))){
                    freMap.put(s.charAt(i), freMap.getOrDefault(s.charAt(i), 0)+1);
                    if(freMap.get(s.charAt(i)) == 1){
                        count++;
                    }
                }
                i++;
                j++;

            }
        }
        System.out.println(ans);


    }

}
