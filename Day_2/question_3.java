// 2nd -> we can use Binary Search (Complexity -> O(logn))

class Solution {
    public boolean isPerfectSquare(int num) {
        if (num < 2) return true;

        int low = 2;
        int high = num / 2; 
        while (low <= high) {
            long mid = low + (high - low) / 2; 
            long square = mid * mid;
            if (square == num) return true;
            else if (square > num) high = (int) mid - 1;
            else low = (int) mid + 1;
        }
        return false;
    }
}




// 1st most optimal approach but with sqrt function

// class Solution {
//     public boolean isPerfectSquare(int num) {
//         int ans = (int)Math.sqrt(num);
//         return num == ans*ans;
//     }
// }