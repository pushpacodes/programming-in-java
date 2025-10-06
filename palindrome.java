import java.util.*;
public class palindrome{
    public static boolean isPalindrome(int n){
        int r=0;
        int temp = n;
        while (n>0){
            int d = n%10;
            r = r*10 + d;
            n=n/10;
        }
        if(temp == r){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number:");
        int n = sc.nextInt();
        System.out.print(isPalindrome(n));
    }
}
