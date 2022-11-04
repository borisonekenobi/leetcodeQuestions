/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null) return false;
        ListNode current = head;
        ArrayList<ListNode> list = new ArrayList<ListNode>();
        int pos;
        
        while (true) {
            if (current.next == null) return false;
            if (list.contains(current)) return true;
            list.add(current);
            current = current.next;
        }
    }
}