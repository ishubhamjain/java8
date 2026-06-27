package June2026Interview;

public class ReverseAword {
    public static void main(String[] args) {
        String str = "Java Selenium";

        String[] words = str.split(" ");

        for(String word : words){
            System.out.print(
                    new StringBuilder(word).reverse() + " ");
        }
    }
}
