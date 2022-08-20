/*
Anagram Strings
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given N strings and Q queries, for each query you will be given a string, your task is to print all the anagrams of the string from the given N strings. If no anagrams exist then print -1.

Note:- Given string may contain duplicated strings you should print it as many times as it occurs.
Input
First line of input contains a single integer N, second line of input contains N space separated strings. Third line of input contains a single integer Q, next Q line contains a single string each.

Constraints:-
1 < = N < = 1000
1 < = |String| < = 10
1 < = Q < = 100000

Note:-String will only contain lower case english letters
Output
For each query in a new line print the anagrams in lexicographical order separated by spaces.
Example
Sample Input:-
6
cat tea pet tac act eat
4
cat
tca
eee
tea

Sample Output:-
act cat tac
act cat tac
-1
eat tea
*/
