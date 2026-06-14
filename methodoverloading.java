public class methodoverloading{
    public static void main(String args[]){
        Calculator c = new Calculator();
        c.sum(2,3);
    }
}

class Calculator{
    void sum(int a , int b){
        System.out.println(a+b);
    }

    void sum(float a, float b){
        System.out.println(a+b);
    }

    void sum(int a, int b, int c){
        System.out.println(a+b+c);
    }
}