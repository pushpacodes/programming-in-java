import java.util.*;
public class zeroonetriangle{
    public static void pattern(int r , int c){
        for (int i = 1 ; i<=r ; i++){
            for (int j = 1; j<=i ; j++){
                if ((i+j)%2==0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
                }
                System.out.println();
            }
        }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int r = sc.nextInt();
        System.out.print("Enter the number of columns : ");
        int c = sc.nextInt();
        pattern(r,c);
        sc.close();
    }
    }
