import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static int gcd(int a,int b){
        if(a==0){
            return b;
        }
        return gcd(b%a,a);
    }
    static int findgcd(int arr[],int n){
    int res=arr[0];
        for(int i=1;i<n;i++){
            res=gcd(arr[i],res);
            if(res==1){
            return 1;
        }
        }
        return res;
    }

    public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int r=sc.nextInt();
    int arr[]=new int[n];
    int minimumNumber=100000000;
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
        if(arr[i]<minimumNumber){
            minimumNumber=arr[i];
        }
    }
    int curr=findgcd(arr,n);
    int micGcd[]=new int[n];
    int res=arr[0];
    for(int i=1;i<n;i++){
        res=gcd(arr[i],res);
        if(res==1){
            micGcd[i]=1;
            break;
        }
        micGcd[i]=res;
    }
    if(curr>=r){
        System.out.print(curr);
        return;
    }
    int currMin=10000000;
    int indx=-1;
    for(int i=0;i<n;i++){
        if(micGcd[i]>0 && micGcd[i]<currMin){
            currMin=micGcd[i];
            indx=i;
        }
    }
    int newAdded=0;
    int currMax=curr;
   for(int i=1;i<=r;i++){
        int temp=gcd(i,minimumNumber);
        if(temp>currMax){
            currMax=temp;
            newAdded=i;
        }
    }
    System.out.print(currMax);
    }
