package HashMap;

import java.util.*;

public class Practise1 {
    public static void main(String[] args) {
        String[] str = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> value = helper(str);
        System.out.println(value);
    }

    private static List<List<String>> helper(String[] strs) {
        HashMap<String, ArrayList<String>> storeMap = new HashMap<>();
        List<List<String>> result = new ArrayList<>();
        for(int i = 0 ; i < strs.length; i++){
            char[] ch = strs[i].toCharArray();
            Arrays.sort(ch);
            String afterSort = String.valueOf(ch);

            if(storeMap.containsKey(afterSort)){
                //add value to the map
                storeMap.get(afterSort).add(strs[i]);
            }else{
                //create new value in the map
                //Learn **
                storeMap.computeIfAbsent(afterSort, x -> new ArrayList<String>()).add(strs[i]);
            }
        }
        for(Map.Entry<String, ArrayList<String>> resultMap : storeMap.entrySet()){
           result.add(resultMap.getValue());
        }


        return result;

    }
}
