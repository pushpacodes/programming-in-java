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
