package Java2026.Interview.practice;

public class ReverseString2 {
    public static void main(String[] args) {
        String name = "Shubham";

        for(int i=name.length()-1;i>=0;i--){
            System.out.print(name.charAt(i));
        }
    }
}
