/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int k=0;
        ListNode curr=head;
        while(curr!=null){
            k++;
            curr=curr.next;
        }
        int removeindex=k-n;
        if(removeindex==0){
            return head.next;
        }
        ListNode cur = head ;
        for (int i =0; i<k-1;i++){
            if((i+1)==removeindex){
                cur.next=cur.next.next;
              
            }
            cur =cur.next;

        }
        return head;

        

    }
}
