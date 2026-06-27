package Java2026.Interview.practice;

public class ReverseString {
    public static void main(String[] args) {
        String name = "shubham";

        for(int i=name.length()-1;i>=0;i--){
            System.out.print(name.charAt(i));
        }

    }
}
