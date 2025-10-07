import java.util.*;
public class invertedpyramid{
    public static void inverted(int r , int c){
         for (int i =0 ; i<=r ; i++){
            for (int j = 0; j<=r-i;j++){
                System.out.print(" ");
            }
            for (int j = 0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
         }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of rows:");
        int r = sc.nextInt();
        System.out.print("enter number of columns:");
        int c = sc.nextInt();
        inverted(r,c);
    }
}
