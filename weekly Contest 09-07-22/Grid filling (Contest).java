/*
Grid filling (Contest)
easy
hint
Hint

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Ram has recently purchased an empty rectangular grid of NxM dimension. He wants to fill the grid but in a special way. His way of filling is, He choose any block which is not filled yet and fills it and the points obtained in particular step is the number of filled neighbouring block. Neighbour block denotes the block which shares some common side between them. When Ram fills all the blocks then he will stop and calculate the total number of points. Ram wants to know the maximum points he can get?
Input
The first line of the input contains a single Integer T, denoting number of test cases.
The next T lines contains two space separated integer N, M i.e dimensions of grid.

Constraints
1 ≤ T ≤ 100
1 ≤ N, M ≤ 1000
Output
Print the maximum number of points Ram can get.
Example
Sample Input
1
2 2

Sample Output
4

Explanation
Ram can obtain total score 4 in the following way.
First he filled top right block, point = 0;
Then he filled bottom left block, point = 0;
Then when he fill either top left and bottom right, the points obtained in both the cases will be 2 hence maximum 4 points are possible.
*/
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
   Scanner sc=new Scanner(System.in);
   int tc=sc.nextInt();
    for(int t=0;t<tc;t++){
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a=(2*(m-1));
        int b=(n-1);
     int ptc=1+a;
     int ptr=b*ptc;
     int totalPoint=(m-1)+ptr;
     System.out.println(totalPoint);
    }

    }
}

//Trying to find complexity

// TC=O(1)
// SPACE COMPLEXITY=O(1)
