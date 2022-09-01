import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
     Scanner sc=new Scanner(System.in);
     String str[]=sc.nextLine().split(" ");
     int n=Integer.parseInt(str[0]);
     long k=Long.parseLong(str[1]);
     int arr[]=new int[n];
     String nums[]=sc.nextLine().split(" ");
     for(int i=0;i<n;i++){
         arr[i]=Integer.parseInt(nums[i]);
     }
     long sum=0;
     HashMap<Long,Integer>hm=new HashMap<>();
     long start=0,end=-1;
       for(int i=0;i<n;i++){
           sum+=arr[i];
           if(sum==k){
               start=0+1;
               end=i+1;
               System.out.println(start+" "+end);
               return;
           }
           if(hm.containsKey(sum-k)){
               start=hm.get(sum-k)+2;
               end=i+1;
               System.out.println(start+" "+end);
               return;
           }else if(hm.containsKey(sum-k)==false){
               hm.put(sum,i);
           }
       }
     System.out.println("-1");
    }
}

/*
Subarray with given sum
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an unsorted array A of size N of non-negative integers, find a continuous sub-array which adds to a given number S.
Input
Each test case consists of two lines. The first line of each test case is N and S, where N is the size of array and S is the sum. The second line of each test case contains N space-separated integers denoting the array elements.

Constraints:-
1 <= N <= 10^5
1 <= Ai <= 10^5
Output
Print the starting and ending positions (1 indexing) of first such occurring subarray from the left if sum equals to subarray, else print -1.
Example
Sample Input
5 12
1 2 3 7 5

Sample Output
2 4

Sample Input
10 15
1 2 3 4 5 6 7 8 9 10

Sample Output
1 5
*/
