import java.util.*;
public class prime{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number:");
        int n = sc.nextInt();
        int count =0;
        for(int i =0;i<=n;i++){
            if (i%n==0){
                count+=1;
            }
        }
        if (count==2){
            System.out.println(n+"is a prime number");
        }
        else{
            System.out.println(n+"is not a prime number");
        }
        sc.close();
    }
}
