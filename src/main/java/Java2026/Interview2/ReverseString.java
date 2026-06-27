package Java2026.Interview2;

public class ReverseString {
    public static void main(String[] args) {
        String name = "Shubham";

        for(int i=name.length()-1;i>=0;i--){
            System.out.print(name.charAt(i));
        }

        StringBuffer stringBuffer = new StringBuffer(name);
        System.out.println(stringBuffer.reverse());
    }
}
