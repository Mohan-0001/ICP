class Solution {
    public int[] searchRange(int[] nums, int target) {
        // int low = 0;
        // int high = nums.length - 1;
        int res[] = {-1,-1};
        res[0] = findFirstPosition(nums, target);
        res[1] = findLastPosition(nums, target);
        return res;
    }

    public int findFirstPosition(int[] nums,int target){
        int low =0;
        int high = nums.length-1;
        int ans = -1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid] == target){
                ans =mid;
                high = mid - 1;
            }
            else if(nums[mid]<target) low = mid + 1;
            else high = mid - 1;
        }
        return ans;
    }

    public int findLastPosition(int[] nums,int target){
        int low = 0;
        int high = nums.length-1;
        int ans = -1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid]==target){
                ans = mid;
                low = mid + 1;
            }
            else if(nums[mid]<target) low = mid + 1;
            else high = mid - 1; 
        }
        return ans;
    }
}