package HashMap;

import java.util.*;

public class Practise1 {
    public static void main(String[] args) {
        String s = "asadfgeg";
        StringBuffer sb = new StringBuffer();
        char ch[] = s.toCharArray();

        for(int i = 1; i < ch.length ; i++){

            sb.append(ch[i] - ch[i-1]+"*");
        }
        System.out.println(sb.toString());
//        char ch = 'A';
//        int as = ch;
//        System.out.println(as);
    }
}

