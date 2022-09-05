package com.company;

public class FirstLastPosition {
    public static int[] main(String[] args) {


        int [] nums = {1,2,6,7,8,9,10,15,19,22,25,32,37,65,100,125};
        int target = 30;
        int[] ans = {-1,-1};
        int start = search (nums, target, findStartIndex: true );
        int end = search (nums, target, findStartIndex: false);

        ans[0] = start;
        ans[1] = end;

        return ans;

    }

    static int search (int[]nums, int target, boolean findStartIndex){
        int ans = -1;
        int start = 0;
        int end = nums.length-1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (target < nums[mid]){
                end = mid - 1;
            }else if (target > nums[mid]){
                start = mid + 1;
            }else {
                ans = mid;
                if (findStartIndex){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }
            }
        return ans;
    }
}
