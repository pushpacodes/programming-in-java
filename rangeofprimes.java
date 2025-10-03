import java.util.*;
public class rangeofprimes {
    public static boolean prime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void primes(int a){
        for(int i =2;i<=a;i++){
            if (prime(i)==true){
                System.out.println(i);
            }
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("the prime numbers are:");
        primes(a);
    }
}
