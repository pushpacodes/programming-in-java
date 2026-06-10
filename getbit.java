import java.util.*;
public class getbit{
    public static void get(int n , int i){
        int bitmask=1<<i;
        if ((n & bitmask)==0){
            //even
            System.out.print(i +" bit is "+0);
        }
        else{
            System.out.print(i+" bit is "+ 1);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = sc.nextInt();
        get(n , i);
    }
}