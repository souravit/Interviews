package SampleTest;

public class sam4 {
    public static void main(String[] args) {
//        int a[] = new int[26];
//        char c[] = {'a','a','b','b','b','c'};
//        for(int i = 0 ; i < c.length ; i++){
//            a[c[i]-'0']++;
//        }
        String s = "sourav";
        StringBuffer sb = new StringBuffer(s);
        sb.delete(0,2);
        System.out.println(sb);

    }
}
