package June2026Interview;

public class ReverseAInterger {
    public static void main(String[] args) {
        int val = 1223;
        StringBuilder  stringBuilder= new StringBuilder(String.valueOf(val));
        System.out.println(stringBuilder.reverse());
        System.out.println(Integer.valueOf(String.valueOf(stringBuilder.reverse())));
    }
}
