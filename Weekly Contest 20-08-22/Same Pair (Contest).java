import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int arr[]=new int[n];
   for(int i=0;i<n;i++){
       arr[i]=sc.nextInt();
   }
   ArrayList<Integer>list=new ArrayList<>();
   for(int i=0;i<n;i++){
       list.add(arr[i]);
   }
   sc.close();
   pairfind(list,n);
    }
    public static void pairfind(ArrayList<Integer>num,int n){
        TreeMap<Integer,Integer>tm=new TreeMap<>();
        for(int i=0;i<n;i++){
            int key=num.get(i);
            if(tm.containsKey(key)==false){
                tm.put(key,1);
            }else{
                int val=tm.get(key);
                tm.put(key,val+1);
            }
        }
        int all=0;
        for(Integer key:tm.keySet()){
            int val=tm.get(key);
            all+=val*(val-1)/2;
        }
        int result=0;
        for(int i=0;i<n;i++){
            result=all-tm.get(num.get(i))+1;
            System.out.print(result+" ");
        }
        System.out.println();
    }
}
