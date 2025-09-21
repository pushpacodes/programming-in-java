import java.util.*;
public class largestof2numbers {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a>b){
            System.out.print(a+"is greater than"+b);
        }
        else{
            System.out.print(b+"is greater than"+a);
        }
    }
    
}
