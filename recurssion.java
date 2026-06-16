public class recurssion{
    public static void printdec(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        System.out.print(n + " ");
        printdec(n-1);
    }
    public static void printinc(int n){
        if(n==1){
            System.out.print(n);
            return;
        }
        printinc(n-1);
        System.out.print(n+" ");
    }
    public static void main(String args[]){
        //decreasing numsbers
        int n = 10;
        printinc(n);
    }
}