import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     String arr[]=new String[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.next();
    }
 HashMap<String,Integer>hs=new HashMap<>();
     for(int i=0;i<n;i++){
     if(hs.containsKey(arr[i])==false){
     hs.put(arr[i],i);
     }else{
         System.out.println("NO");
             return;
     }
         }
    for(int i=0;i<n-1;i++){
        String word=arr[i];
        int s=word.length();
        String word1=arr[i+1];
        int s1=word1.length();
        if(word.charAt(s-1)!=word1.charAt(0)){
            System.out.println("NO");
        }
    }
    
    System.out.println("YES");
    }
}

/*
Word Game
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Sara is playing a word game with the following rules:-
* The first letter of the word should be the same as the end letter of the previous word
* All words should be unique

Given N words which Sara has spoken your task is check if Sara is going to win or lose.
Input
The first line of input contains a single integer N. The next N line contains a single string each.

Constraints:-
1 <= N <= 10000
1 <= |S| <= 20

Note:- String will contain only lowercase english letters
Output
Print "YES" if Sara is going to win else print "NO".
Example
Sample Input:-
4
school
letsgo
over
right

Sample Output:-
YES

Sample Input:-
3
newton
newton
no

Sample Output:-
NO
*/
