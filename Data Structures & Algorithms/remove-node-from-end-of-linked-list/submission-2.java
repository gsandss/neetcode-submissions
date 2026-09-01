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
    int counter;
    public ListNode removeNthFromEnd(ListNode head, int n) {

        int len = 1;
        ListNode curr = head;
        while(curr != null){
            curr = curr.next;
            len++;
        }

        if(len - n == 1){
            return head.next;
        }
        
        int tmp = 1;
        curr = head;
        while(curr != null){
            if(len-tmp == n+1){
                System.out.println("enter");
                curr.next = curr.next.next;
                return head;
            }
            tmp++;
            curr = curr.next; 
        }
        return head;
    }
}
