/*
Delete from end
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given head which is a reference node to a singly- linked list. Complete the function delete_end which delete all nodes after M Nodes of a Linked List.
Input
User task:
Since this will be a functional problem, you don't have to take input. You just have to complete the functions delete_end that takes the head of the linked list as parameter.

Constraints:
The Linked List is not empty.
Number of nodes(N) will not exceed 1000.
1 <= M <= N
Output
You need not return anything. Just modify the original linked list.
Example
Sample Input 1:-
3 1
1 2 3

Sample Output 1:-
1

Explanation
M = 1
So delete all nodes after 1st node.


Sample Input 2:-
5 3
1 2 3 4 5

Sample Output 2:-
1 2 3

Explanation:
Delete all nodes after 3rd node.
*/

/*
class Node
{
	int data;
    	Node next;
    	Node(int d){
    	    data=d;
    	}
};
*/
static void delete_end(Node head,int m)
    {
       Node run=head;
	   for(int i=1;i<m;i++){
		   run=run.next;
	   }
	   run.next=null;
	   
    }
