import java.util.*;
public class productfunction{
    public static int product(int a, int b){
        int result=a*b;
        return result;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int prod = product(a,b);
        System.out.println("the product of a and b :"+prod);
    }
}
