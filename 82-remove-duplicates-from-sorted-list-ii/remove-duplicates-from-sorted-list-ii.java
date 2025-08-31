class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;

        ListNode dummy = new ListNode(0, head); // dummy before head
        ListNode prev = dummy;                  // prev is the node before the current sequence
        ListNode curr = head;

        while (curr != null) {
            // check if current node has duplicates
            if (curr.next != null && curr.val == curr.next.val) {
                // skip all nodes with this value
                while (curr.next != null && curr.val == curr.next.val) {
                    curr = curr.next;
                }
                // link prev to node after last duplicate
                prev.next = curr.next;
            } else {
                // no duplicate, move prev forward
                prev = prev.next;
            }
            curr = curr.next;
        }
        return dummy.next;
    }
}
