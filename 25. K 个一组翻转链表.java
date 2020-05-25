/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || k <= 0) return null;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curNode = dummy;
        ListNode preNode = dummy;
        while(curNode != null){
            int n = k+1;
            while(n > 0 && curNode != null){
                curNode = curNode.next;
                n--;
            }
            if(n == 0) {
                reverse(preNode, curNode);
                n = k;
                while(n > 0){
                    preNode = preNode.next;
                    n--;
                }
                curNode = preNode;
            }
        }
        return dummy.next;
    }
    public void reverse(ListNode preHead, ListNode tailNext){
        ListNode cur = preHead.next;
        preHead.next = tailNext;
        while(cur != tailNext){
            ListNode nextNode = cur.next;
            cur.next = preHead.next;
            preHead.next = cur;
            cur = nextNode;
        }
    }
}










