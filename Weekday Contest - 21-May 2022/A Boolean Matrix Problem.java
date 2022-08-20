/*
A Boolean Matrix Problem
easy
hint
Hint

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given a matrix Mat of m rows and n columns. The matrix is boolean so the elements of the matrix can only be either 0 or 1.
Now, if any row of the matrix contains a 1, then you need to fill that whole row with 1. After doing the mentioned operation, you need to print the modified matrix.
Input
The first line of input contains T denoting the number of testcases. T testcases follow.
The first line of each testcase contains m and n denoting number of rows and number of columns.
Then next m lines contain n elements denoting the elements of the matrix.

Constraints:
1 <= T <= 20
1 <= m, n <= 700
Mat[I][j] ∈ {0,1}
Output
For each testcase, in a new line, print the modified matrix.
Example
Input:
2
5 4
1 0 0 0
0 0 0 0
0 1 0 0
0 0 0 0
0 0 0 1
1 2
0 0

Output:
1 1 1 1
0 0 0 0
1 1 1 1
0 0 0 0
1 1 1 1
0 0

Explanation:
Testcase1: rows = 5 and columns = 4
The given matrix is
1 0 0 0
0 0 0 0
0 1 0 0
0 0 0 0
0 0 0 1
Evidently, the first row contains a 1 so fill the whole row with 1. 
The third row also contains a 1 so that row will be filled too. Finally, the last row contains a 1 and therefore it needs to be filled with 1 too.
The final matrix is
1 1 1 1
0 0 0 0
1 1 1 1
0 0 0 0
1 1 1 1
*/
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
	int tc=Integer.parseInt(sc.nextLine());
	for(int t=0;t<tc;t++){
		String num[]=sc.nextLine().split(" ");
		int r=Integer.parseInt(num[0]);
		int c=Integer.parseInt(num[1]);
		int arr[][]=new int[r][c];
		for(int i=0;i<r;i++){
			String temp[]=sc.nextLine().split(" ");
			int number=0;
			for(int j=0;j<c;j++){
				arr[i][j]=Integer.parseInt(temp[j]);
				if(arr[i][j]==1){
					number=1;
					break;
				}
			}
			for(int j=0;j<c;j++){

				System.out.print(number+" ");
			
			}
			System.out.println();
		   
		}
	}
    }
}
