class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> less = new ArrayList<>();
        ArrayList<Integer> equal = new ArrayList<>();
        ArrayList<Integer> greater = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot){
                less.add(nums[i]);
            }
            else if(nums[i]==pivot){
                equal.add(nums[i]);
            }
            else{
                greater.add(nums[i]);
            }
        }
        int ans[]=new int[nums.length];
        int k=0;
        for(int i=0;i<less.size();i++){
            ans[k]=less.get(i);
            k++;
        }
        for(int i=0;i<equal.size();i++){
            ans[k]=equal.get(i);
            k++;
        }
        for(int i=0;i<greater.size();i++){
            ans[k]=greater.get(i);
            k++;
        }
        return ans;
    }
}
