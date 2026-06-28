public class Searchinrotatedarray{
    public static int search(int arr[],int target,int si,int ei){
        int mid=si+(ei-si)/2;
        if (arr[mid]==target){
            return mid;
        }
        //line 1
        if(arr[si]<=arr[mid]){
            //case-a
            if(arr[si]<=target && target<=arr[mid]){
                return search(arr,target,si,mid);
            }
            //case-b
            else{
                return search(arr,target,mid+1,ei);
            }
        }
        //line2
        else{
            if(arr[mid]<=target && target<=arr[ei]){
                return search(arr,target,mid,ei);
            }
            else{
                return search(arr,target,si,mid-1);
            }
        }
    }
    public static void main(String args[]){
        int arr[]={4,5,6,7,0,1,2};
        int target=0;//output:4
        int idx=search(arr,0,0,arr.length-1);
        System.out.print(idx);
    }
}