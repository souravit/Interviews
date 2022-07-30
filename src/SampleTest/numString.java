package SampleTest;

public class numString {
    public static void main(String[] args) {
        String s = "10";
        int num = 0;
        char c[] = s.toCharArray();
        if(Character.isDigit(c[0])){
            num = num * 10 + c[0] - '0';
        }
        System.out.println(num);
    }
}
