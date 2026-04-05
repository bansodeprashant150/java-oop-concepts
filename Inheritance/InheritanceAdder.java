package Inheritance;

class Arithmetic{

    int add(int a, int b){
        return a+b;
    }
}

class Adder extends Arithmetic{

}

public class InheritanceAdder {
    public static void main(String[] args) {
        Adder a=new Adder();
        System.out.println(a.getClass().getSuperclass().getName());
        System.out.println(a.add(12, 90));
    }
}
