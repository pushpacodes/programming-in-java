import java.util.*;
public class floydpattern{
    public static void floyd(int r , int c){
        int count = 1;
        for (int i =1 ; i<=r ; i++){
            for (int j = 1; j<=i;j++){
                System.out.print(count+" ");
                count++;
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
        floyd(r,c);
        sc.close();
    }
}
