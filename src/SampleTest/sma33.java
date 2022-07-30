package SampleTest;

import java.util.LinkedHashMap;

public class sma33 {
    public static void main(String[] args) {
        int a[] = {1,1,1,4,4,4,2,1};
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        for(Integer arr : a){
            map.put(arr, map.getOrDefault(arr,0)+1);
        }
        System.out.println(map);
    }

}
