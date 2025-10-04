import java.util.*;
public class bintodec{
    public static void bindec(int bin){
        int dec = 0;
        int pow=0;
        int temp = bin;
        while(temp>0){
            int lastdigit = temp%10;
            dec = dec + (lastdigit * (int)Math.pow(2,pow));
            pow++;
            temp = temp/10;
        }
        System.out.println("the decimal number of "+bin+" is "+dec);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the binary number:");
        int bin = sc.nextInt();
        bindec(bin);
    }
}
