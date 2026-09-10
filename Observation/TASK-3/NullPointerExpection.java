package Observations;

public class NullPointerExpection {
    public static void main(String[] args) {
        try{
           String s = null;
           System.out.println(s.length());
        }catch(NullPointerException n){
            System.out.println("Null Value canot be used");
        }
        }
    }
