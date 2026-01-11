class Solution {
    public void sortColors(int[] nums) {
        int left = 0, i = 0;
        int right = nums.length-1;
        while(i<=right){
            if(nums[i]==0){
                swap(nums, left, i);
                left++;
                i++;
            }
            else if(nums[i]==2){
                swap(nums, i, right);
                right--;
            }
            else{
                i++;
            }
            
        }

    }
    public void swap(int arr[], int l, int r){
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }
}