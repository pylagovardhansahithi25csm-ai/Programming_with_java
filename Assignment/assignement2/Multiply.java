interface Demo{
    int x=10,y=20;
    void divide();
}
class Subtract{
 void add (){
    int a=2;
        System.out.println("add:" +(a+10));
    }
}

class Sample extends Subtract implements Demo{
    void multiply(){ 
    int b=3;
    System.out.println("multiply:"+(b*2));
}

@Override
    public void divide(){
        System.out.println("subtract:" +(y/x));
    }
}
public class Multiply {
    public static void main(String args[]){
        Sample s=new Sample();
        s.multiply();
        s.divide();
    }

    
}
