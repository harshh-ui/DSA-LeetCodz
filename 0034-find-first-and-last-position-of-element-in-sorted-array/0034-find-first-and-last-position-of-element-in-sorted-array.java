class Solution {
    public int[] searchRange(int[] nums, int target) {
        int result[]=new int[2];
        result[0] = binarySearch(nums , target, true);
        result[1] = binarySearch(nums, target, false);

        return result;
    }

    public int binarySearch(int[] nums, int target, boolean firstValue) {
        int low = 0, high = nums.length-1,result = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(target == nums[mid]){
                result = mid;
                if(firstValue){
                    high = mid-1;
                }else{
                    low=mid+1;

                }
            }
            else if(target > nums[mid]){
                low = mid+1;
            }else{
                high = mid-1;
            
            }
        }
        return result;
        
    }
}