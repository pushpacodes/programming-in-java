import java.util.*;
public class avgthree{
    public static int avg(int a, int b, int c){
        int avg = (a+b+c)/3;
        return avg;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter three number:");
        int a  = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.print("average of three numbers " + a + " , " + b +" and " + c +" is " +avg(a,b,c));
    }
}
