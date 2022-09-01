import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
   static boolean isOperator(char x){
      switch(x){
         case '/':
         case '*':
         case '+':
         case '-':
             return true;  
               }
               return false;
   }
    public static String convert(String str){
       Stack<String>stack=new Stack<>();
       int l=str.length();
       for(int i=l-1;i>=0;i--){
          char c=str.charAt(i);
          if(isOperator(c)){
             String op1=stack.pop();
             String op2=stack.pop();
             String temp="("+op1+ c + op2+")";
             stack.push(temp);
          }
          else{
             stack.push(c+"");
          }
       }
  return stack.pop();
    }
    public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
 System.out.println(convert(s));
    }
}
/*
Prefix to Infix
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a Prefix expression, convert it into a Infix expression.

Infix : An expression is called the Infix expression if the operator appears in between the operands in the expression. Simply of the form (operand1 operator operand2).
Example : (M+N) * (O-P)

Prefix : An expression is called the prefix expression if the operator appears in the expression before the operands. Simply of the form (operator operand1 operand2).
Example : *+MN-OP (Infix : (M+N) * (O-P) )
Input
Input contains a single string of prefix expression.

Constraints:
1 < = string length < = 20

Note :- String will only contain uppercase english letters and maths operand :- '/', '*', '+', '-'.

Output
Print the Infix expression.
Example
Sample Input
*-A/BC-/AKL

Sample Output:
((A-(B/C))*((A/K)-L))

Sample Input
+AB

Sample Output
A+B
*/
