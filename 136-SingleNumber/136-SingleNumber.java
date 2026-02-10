// Last updated: 2/10/2026, 9:25:00 AM
class Solution {
    public int singleNumber(int[] nums) {
        int x=0;
        for(int num:nums)
            x^=num;
        return x;
    }
}