package HashMap;

import java.util.*;

public class Practise1 {
    public static void main(String[] args) {
        String s = "abb";
        palin(s);

    }

    private static void palin(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        char ch[] = s.toCharArray();
        for(int i = 0 ; i < s.length(); i++){
            map.put(ch[i], map.getOrDefault(ch[i], 0)+1);
        }
        int count = 0 ;
        boolean flag = true;
        int max = 0;
       for(Map.Entry<Character, Integer> value: map.entrySet()){
           if(value.getValue()%2 == 0){
               count +=value.getValue();
           } else if (value.getValue() % 2 == 1) {
                max = Math.max(max, value.getValue());
           }
       }
       count +=max;
        System.out.println(count);

    }
}

