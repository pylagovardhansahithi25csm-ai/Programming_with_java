package Assignment;


    class StringSplit {
    public static void main(String[] args) {
        String str = "Java is easy";

        String[] words = str.split(" ");

        for (String word : words) {
            System.out.println(word);
        }
    }
}
