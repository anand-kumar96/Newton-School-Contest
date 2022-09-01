import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
   public static void anticlockwise(int mat[][],int startrow,int startcol,int endrow,int endcol,int element){
       for(int i=startrow;i<=endrow && element>0;++i,element--){
           System.out.print(mat[i][startrow]+" ");
       }
       for(int i=startrow+1;i<=endcol && element>0;++i,element--){
           System.out.print(mat[endrow][i]+" ");
       }
       for(int i=endrow-1;i>startrow && element>0;--i,element--){
           System.out.print(mat[i][endcol]+" ");
       }
       for(int i=endcol;i>startcol && element>0;--i,element--){
        System.out.print(mat[startrow][i]+" ");
       }
       if(startrow + 1<=endrow-1 && element>0){
           anticlockwise(mat,startrow+1,startcol+1,endrow-1,endcol-1,element);
       }
   }
    public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int mat[][]=new int[n][n];
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            mat[i][j]=sc.nextInt();
        }
    }
        int row=mat.length;
        int col=mat[0].length;
        int element=row*col;
        anticlockwise(mat,0,0,row-1,col-1,element);
    
    }
}


/*
Anti clockwise
medium
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an N*N matrix. Print the elements of the matrix in anticlockwise order (see the sample for better understanding).
Input
First line contains N.
N lines follow each containing N space seperated integers.

Constraints:-
2 <= N <= 500
1 <= Mat[i][j] <= 1000
Output
Output N*N integers in a single line separated by spaces, which are the elements of the matrix in anti-clockwise order.
Example
Sample Input
4
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16

Sample output
1 5 9 13 14 15 16 12 8 4 3 2 6 10 11 7

Sample Input
3
1 2 3
4 5 6
7 8 9

Sample output
1 4 7 8 9 6 3 2 5

*/
