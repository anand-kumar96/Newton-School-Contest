import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
    int tc=Integer.parseInt(sc.next());
    while(tc-->0){
    int one=0;
    int zero=0;
     int n=Integer.parseInt(sc.next());
 String str=sc.next();
    for(int i=0;i<n;i++){
    if(str.charAt(i)=='0'){
     zero++;
    }else{
        one++;
    }
    }
        
    int p=one/2;
    if(one%2==1){
         System.out.println("0");
    }else if(p%2==0){
         System.out.println("1");
    }else{
         System.out.println("0");
    }
      
    }
    }
