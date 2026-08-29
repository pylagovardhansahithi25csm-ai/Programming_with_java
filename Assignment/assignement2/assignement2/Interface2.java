interface Cat{
    void eat();
}
interface Dog {
    void sound();

}
interface Animals extends Cat,Dog{
void eat();

    void sound();

}

public class Interface2 implements Animals{

    @Override
    public void eat() {
        System.out.println("dog eats bones:");
        System.out.println("cat drinks milk:");
    }

    @Override
    public void sound() {
        System.out.println("dog sounds bow bow");
        System.out.println("cat sounds meow meow:");

        
    }
    public static void main(String[] args) {
        Interface2 i=new Interface2();
        i.sound();
        i.eat();
    }
    
    
}
 