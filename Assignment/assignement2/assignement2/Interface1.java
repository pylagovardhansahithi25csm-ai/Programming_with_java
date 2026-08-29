interface Animal{
    void sound();

}
interface Dog extends Animal{
    public void sound();


    }


public class Interface1 implements Dog {
void sample(){
    int a=10;
    System.out.println("add:"+(a+10));
}
        
    @Override
    public void sound() {
        System.out.println("dog sounds bow bow: ");
        
    }
    
    public static void main(String[] args) {
        
    Interface1 i=new Interface1();
    i.sound();
    i.sample();
}
}
