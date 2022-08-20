/*
Odd subarray
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an array Arr of N integers. Find the number of subarrays of this array which are powerful.

A subarray [L, R] (1 <= L <= R <= N) is said to be powerful if the product AL * AL+1 * ... * AR-1 * AR is odd.
Input
First line of input contains a single integer N
Second line of input contains N integers representing the elements of the array Arr


Constraints
1 <= N <= 100000
1 <= Arr[i] <= 100000
Output
Output the number of powerful subarrays of array Arr.
Example
Sample input 1
5
2 4 4 5 3

Sample output 1
3

Sample input 2
3
1 5 1

Sample Output 2
6

Explanation
Test Case1:- (3), (5), (3, 5) are the required subarrays.
Test Case2:- (1), (2), (1), (1, 5), (5, 1]) (1, 5, 1) are the required subarrays.
*/
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static long countsub(int arr[],int n){
        long count=0;
        int last=-1;
        long k=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                k=(i-last-1);
                count+=(k*(k+1)/2);
                last=i;
            }
        }
        k=(n-last-1);
        count+=(k*(k+1)/2);
        return count;
    }
    public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    System.out.println(countsub(arr,n));
    }
}
