import java.util.*;
public class binomialcoefficient {
    public static int facti(int a){
        int factorial = 1;
        for(int i=1;i<=a;i++){
            factorial*=i;
        }
        return factorial;
    }
    public static int binomial(int n, int r){
        return facti(n)/(facti(r)*facti(n-r));
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int fact = binomial(n,r);
        System.out.println("the binomial coefficient is :"+fact);
    }
}
