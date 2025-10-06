import java.util.*;
public class even{
    public static boolean isEven(int a){
        if (a%2==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number:");
        int a = sc.nextInt();
        System.out.print(isEven(a));
    }
}