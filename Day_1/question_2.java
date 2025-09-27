class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] res = new int[n-k+1];
        Deque<Integer> dq = new ArrayDeque<>();

        for(int i=0;i<n;i++){
            // if index is out of the window range so we remove it from the queue
            if(!dq.isEmpty() && dq.peekFirst() <= i-k){
                dq.pollFirst();
            }

            // if the last index's element is not max than the current element in nums then remove it from the queue from last till i get the right condition
            while(!dq.isEmpty() && nums[dq.peekLast()] <= nums[i]){
                dq.pollLast();
            }

            // at the end add the new element if it setisfy the above 2
            dq.addLast(i);

            // if ith value is st or more than k size that mean now answers are comming from that ith position
            if(i >= k-1){
                res[i - k + 1] = nums[dq.peekFirst()];
            }
        }
        return res;
    }
}
