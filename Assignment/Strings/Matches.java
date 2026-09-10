package Assignment;
   class StringMatches {
    public static void main(String[] args) {
        String str = "12345";

        if (str.matches("[0-9]+")) {
            System.out.println("String contains only numbers");
        } else {
            System.out.println("String contains other characters");
        }
    }
}
