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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode list1Reversed = reverse(list1);
        ListNode list2Reversed = reverse(list2);
        ListNode result = null;
        
        while (true) {
            if (list1Reversed == null) {
                if (list2Reversed == null) break;
                
                result = new ListNode(list2Reversed.val, result);
                list2Reversed = list2Reversed.next;
            } else if (list2Reversed == null) {
                result = new ListNode(list1Reversed.val, result);
                list1Reversed = list1Reversed.next;
            } else {
                if (list1Reversed.val > list2Reversed.val) {
                    result = new ListNode(list1Reversed.val, result);
                    list1Reversed = list1Reversed.next;
                } else {
                    result = new ListNode(list2Reversed.val, result);
                    list2Reversed = list2Reversed.next;
                }
            }
        }
        
        return result;
    }
    
    private ListNode reverse(ListNode head) {
        ListNode resultHead = null;
        ListNode current = head;
        while (current != null) {
            resultHead = new ListNode(current.val, resultHead);
            current = current.next;
        }
        return resultHead;
    }
}