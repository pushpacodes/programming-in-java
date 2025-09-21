import java.util.*;
public class ternaryoperator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String result =(a>=33 &&a<=100) ? "pass":"fail";
        System.out.print(result);
    }
}
