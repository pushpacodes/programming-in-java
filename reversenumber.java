//method 1
public class reversenumber {
    public static void main(String args[]){
        int n = 12345678;
        while (n>0){
            int rem = n%10;
            System.out.print(rem);
            n=n/10;
        }
    }
}
// methd 2
public class reversenumber{
    public static void main(String args[]){
        int i = 123456789;
        int rev =0;
        while(i>0){
            int rem = i%10;
            rev = (rev * 10 )+rem;
            i/=10;
        }
        System.out.println(rev);
    }
}
