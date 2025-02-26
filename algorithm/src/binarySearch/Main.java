package binarySearch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(), m = scan.nextInt();
        int nums[] = new int[n];
        for(int i = 0;i<n;i++){
            nums[i] = scan.nextInt();
        }
        while(m-->0){
            int target = scan.nextInt();
            System.out.print(leftMost(target,nums)+" ");
        } 
        
	}

    public static int leftMost(int target,int nums[]){
        int i = 0,j = nums.length-1;
        int candiate = -1;
        while(i<=j){
            int m = (i+j)>>>1;
            if(target < nums[m]){
                j = m-1;
            }else if(nums[m]< target){
                i = m+1;
            }else{
                candiate = m+1;
                j = m-1;
            }
        }
        return candiate;
    }


    
}