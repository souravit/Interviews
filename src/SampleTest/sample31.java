package SampleTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class sample31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i < n ;i++){
            String number = input.next();
            ans.add(Integer.parseInt(number));
        }
        int max = Integer.MIN_VALUE;
        int prev = 0;
        int index = 0;
        for(int i = 0 ; i < ans.size(); i++){
            max = Math.max(max,ans.get(i));
            if(max > prev){
                prev = max;
                index = i+1;
            }
        }

        System.out.println("majority winner "+index);
    }
}
