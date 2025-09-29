import java.util.*;
public class breakex{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        do{
            int number = sc.nextInt();
            if (number%10==0){
                break;
            }
            System.out.println(number);
        }while(true);
        System.out.println("loop ended");
        sc.close(); 
    }
}
