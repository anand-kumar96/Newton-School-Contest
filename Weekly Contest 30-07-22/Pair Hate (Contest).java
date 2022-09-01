import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
    String str=sc.next();
    Stack<Character>st=new Stack<>();
    for(int i=0;i<str.length();i++){
    char ch=str.charAt(i);
    if(!st.isEmpty()&& st.peek()==ch){
    st.pop();
    }else{
    st.push(ch);
    }
    }
    StringBuilder sb= new StringBuilder();
    while(!st.isEmpty()){
    sb.append(st.pop());
    }
    System.out.println(sb.reverse());
    }
    }


/*
Pair Hate (Contest)
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a string S you have to remove all pairs of identical letters, which are consecutive. If after the removal there appear new pairs, remove them as well. Repeat this untill no adjacent letter in the string is same.
Note that deleting of the consecutive identical letters can be done in any order, as any order leads to the same result.
Input
The input data consists of a single string S.

Constraints:
1 <= |S| <= 100000
S contains lowercase english letters only.
Output
Print the given string after it is processed. It is guaranteed that the result will contain at least one character.
Example
Sample Input
hhoowaaaareyyoouu

Sample Output
wre

Explanation:
First we remove "hh" then "oo" then "aa" then "yy" then "oo" then "uu" and we are left with "wre".
Now we cannot remove anything.

Sample Input:-
abcde

Sample Output:-
abcde

Sample Input:-
abcddcb

Sample Output:-
a
*/
