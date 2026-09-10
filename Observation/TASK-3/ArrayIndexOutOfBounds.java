package Observations;

public class ArrayIndexOutOfBounds {
    public static void main(String[] args) {
        int[] numbers ={10,20,30};
        try{
            System.out.println("element:" + numbers[5]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("expection caught: " + e);

        }
        System.out.println("program continues....");
        }
    }

