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
        if (head==null){
            return null;
        }
        List <ListNode> nodes = new ArrayList();
        ListNode current=head;
        while (current!=null){
            nodes.add(current);
            current = current.next;
        }
        int k=nodes.size();
        nodes.remove(k-n);
        if (nodes.isEmpty()){
            return null;
        }
        for (int i=0;i<nodes.size()-1;i++){
            nodes.get(i).next=nodes.get(i+1);
        }
        nodes.get(nodes.size()-1).next=null;
        return nodes.get(0);

    }
}
