public class lastoccurence{
    public static int lo(int arr[],int key,int i){
        if(i==0){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return lo(arr,key,i-1);
    }
    public static void main(String args[]){
        int arr[]={2,3,1,4,6,4,4,7,8,1,2};
        System.out.print(lo(arr,1,arr.length-1));
    }
}