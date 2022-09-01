import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();

    }
    for(int i=0;i<n;i++){
        if(arr[i]<0){
            System.out.print(arr[i]+" ");
        }
    }
    for(int i=0;i<n;i++){
        if(arr[i]>=0){
            System.out.print(arr[i]+" ");
        }
    }
    }
}

/*
Separating Negative and Positive numbers
easy
hint
Hint

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Separate an array of positive and negative integers while maintaining the relative order of the items using merge sort. All positive numbers should come after negative ones, with the relative order remaining the same.
Input
The first line of input will be n, which represents the array's length, followed by the n array items in the second line.

Constraints:
0< n <=100000
1<= arr[i] <= 100000
Output
The result should be an array with negative numbers separated at the front and the relative order of the elements preserved.
Example
Sample Input:
6
-1 1 2 -4 -6 5

Output:
-1 -4 -6 1 2 5
*/
