import java.util.*;
public class factorialfunction{
    public static int facti(int a){
        int factorial = 1;
        for(int i=1;i<=a;i++){
            factorial*=i;
        }
        return factorial;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int fact = facti(a);
        System.out.println("the factorial of a is :"+fact);
    }
}
