import java.util.*;
public class dectobin{
    public static void decbin(int dec){
        int bin = 0;
        int pow = 0;
        int temp = dec;
        while (dec>0){
            int rem = dec%2;
            bin = bin + (rem * (int)Math.pow(10,pow));
            pow++;
            dec = dec/2;
        }
        System.out.println("the binary number of "+ temp + " is " + bin);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the decimal number:");
        int dec = sc.nextInt();
        decbin(dec);
    }
}
