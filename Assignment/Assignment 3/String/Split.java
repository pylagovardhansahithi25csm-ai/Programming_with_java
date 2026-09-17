package Assignments;
   public class Split {
    public static void main(String[] args) {
        String str = "Java is easy";

        String[] words = str.split(" ");

        for (String word : words) {
            System.out.println(word);
        }
    }
} 