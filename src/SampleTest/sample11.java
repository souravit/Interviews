package SampleTest;

class sample11 {
    public static void main(String[] args) {
        int a = 314;
        System.out.println( helper(314));
        System.out.println( helper(1));
        System.out.println( helper(5926));
        System.out.println( helper(5));
        System.out.println( helper(35897));

    }

    private static int helper(Integer number) {
        int length = String.valueOf(number).length();
        return length;
    }
}
