public class abstraction{
    public static void main(String args[]){
        Horse h= new Horse();
        h.walks();
    }
}

abstract class Animal{
    void eats(){
        System.out.println("eats");
    }
    abstract void walks();
}

class Horse extends Animal{
    void walks(){
        System.out.println("walks with 4 legs");
    }
}