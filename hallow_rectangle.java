import java.util.*;
public class hallow_rectangle{
    public static void hallow(int r , int c){
        for (int i =0; i<=r ; i++){
            for (int j =0; j<=c ; j++){
                if (i==0 || i==r || j==0 || j==c){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
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
        hallow(r,c);
    }
}
