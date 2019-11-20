package amazon.algorithms.ad_hoc;

import java.util.Arrays;
/*

Given an array of DISTINCT elements, 
rearrange the elements of array in zig-zag fashion in O(n) time. 
The converted array should be in form a < b > c < d > e < f.

https://www.geeksforgeeks.org/convert-array-into-zig-zag-fashion/

*/
public class ConvertArrayZigZagFashion {

    public static void main(String[] args){
        int arr[]  = {4, 3, 7, 8, 6, 2, 1};
        convertArrayZigZagFashion(arr);
       Arrays.stream(arr).forEach(System.out::println);
    }

    private static void convertArrayZigZagFashion(int[] arr) {
        for(int i=0;i<=arr.length-2;i++){
            if(i%2==0){
                if(arr[i]>arr[i+1]){
                    swap(arr,i,i+1);
                }
            }
            else{
                if(arr[i]<arr[i+1]){
                    swap(arr,i,i+1);
                }
            }
        }
    }

    private static void swap(int[] arr, int i, int i1) {
        int temp = arr[i];
        arr[i] = arr[i1];
        arr[i1] = temp;
    }
}
