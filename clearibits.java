public class clearibits{
    public static void clear(int n,int i){
        int bitmask =(-1)<<i;
        System.out.print((n & bitmask));
    }
    public static void main(String args[]){
        clear(15,2);
    }
}