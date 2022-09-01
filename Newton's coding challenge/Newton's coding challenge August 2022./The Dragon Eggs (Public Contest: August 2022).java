import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
    int G=sc.nextInt();
    int S=sc.nextInt();
    int A=sc.nextInt();
    int B=sc.nextInt();
    if((G*A)>=(S*B)){
        System.out.println("Gold");
    }else{
         System.out.println("Silver");
    }
    }
}
