import java.util.*;
public class invertednumberpyramid{
    public static void inverted(int r , int c){
        for (int i=0;i<=r; i++){
            for (int j=1;j<=r-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter rows:");
        int r = sc.nextInt();
        System.out.print("enter columns:");
        int c = sc.nextInt();
        inverted(r,c);
    }
}
