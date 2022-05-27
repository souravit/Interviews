package HashMap;

import java.util.HashMap;

public class isomorphic_String {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg","add"));
    }

    private static boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();
        HashMap <Character, Character> tmap = new HashMap<>();
        char[] m = s.toCharArray();
        char[] n = t.toCharArray();
        for(int i = 0 ; i < s.length() ; i++){
            if(map.containsKey(m[i])){
                if(map.get(m[i]) != n[i]){
                    return false;
                }
            }else{
                map.put(m[i],n[i]);
            }
            if(tmap.containsKey(n[i])){
                if(tmap.get(n[i]) != m[i]){
                    return false;
                }
            }else{
                tmap.put(n[i],m[i]);
            }
        }
        return true;
    }
}
