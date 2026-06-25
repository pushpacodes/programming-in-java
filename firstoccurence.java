public class firstoccurence{
    public static int fo(int arr[],int key,int i){
        if(i==arr.length-1){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return fo(arr,key,i+1);
    }
    public static void main(String args[]){
        int arr[]={1,4,2,6,7,3,4,9,8,7};
        System.out.print(fo(arr,7,0));
    }
}