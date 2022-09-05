package com.company;

public class CeilingOfNumber {

    public static void main(String[] args) {
        int [] arr = {1,2,6,7,8,9,10,15,19,22,25,32,37,65,100,125};
        int target = 20;
        int ans = Ceiling(arr, target);
        System.out.println(ans);
    }
    static int Ceiling(int[] arr, int target){
        if (target < arr[0]){
            return -1;
        }
        int start = 0;
        int end = arr.length-1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (target < arr[mid]){
                end = mid - 1;
            }else if (target > arr[mid]){
                start = mid + 1;
            }else {
                return mid;
            }
        }
        return start;
    }
}
