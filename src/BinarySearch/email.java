package BinarySearch;

public class email {
    public static void main(String[] args) {
        System.out.println( IsEmailValid("@gmail.com"));
        System.out.println( IsEmailValid("hello.gmail@com"));
        System.out.println( IsEmailValid("gmail"));
        System.out.println( IsEmailValid("hello@gmail"));
        System.out.println( IsEmailValid("hello@gmail.com"));

    }

    private static boolean IsEmailValid(String email) {
        char c[] = email.toCharArray();
        if(c[0] == '@'){
            return false;
        }

        if(email.length() <= 2){
            return false;
        }

        if(email.indexOf("@") == -1){
            return false;
        }
        String[] parts = email.split("@");
        int dot = parts[1].indexOf(".");
        int len = parts[1].length();
        String[] dotSplits = parts[1].split(".");
        int dotCount = dotSplits.length - 1;

        if (dot == -1 || dot < 2 || dotCount > 2) {
            return false;
        }

        for (int i = 0; i < dotSplits.length; i++) {
            if (dotSplits[i].length() == 0) {
                return false;
            }
        }

        return true;
    }


}


