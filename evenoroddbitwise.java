import java.util.*;
public class evenoroddbitwise{
    public static void oddoreven(int n){
        int bitmask=1;
        if ((n & bitmask)==0){
            //even
            System.out.print("number  "+n+" is even");
        }
        else{
            System.out.print("number"+n+"is odd");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        oddoreven(n);
    }
}