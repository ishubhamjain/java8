package test;

public class Asked {
    public static void main(String[] args) {
        String s1 = new String("Oracle");
        String s2 = new String("Oracle");

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        System.out.println(100+100+"oracle");
        System.out.println("oracle"+100+100);
    }
}
