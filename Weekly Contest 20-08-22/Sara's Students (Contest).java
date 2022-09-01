/*
class Node {
    Node next;
    int val;

    Node(int val) {
        this.val = val;
        next = null;
    }
}
*/
public static int maxChocolates(Node head) {
int maxi=0;
Node dummy=new Node(-1);
dummy.next=head;
Node slow=dummy;
Node fast=dummy;
while(fast!=null & fast.next!=null){
    fast=fast.next.next;
    slow=slow.next;
}
fast=slow;
Node prev=null;
slow=slow.next;
Node cur=slow;
Node temp=slow;
while(cur!=null){
   temp=cur.next;
    cur.next=prev;
    prev=cur;
    cur=temp;
}       
fast.next=prev;
int sum=0;
fast=fast.next;
while(fast!=null){
    sum=head.val+fast.val;
    maxi=Math.max(sum,maxi);
    fast=fast.next;
    head=head.next;
}
return maxi;
}
