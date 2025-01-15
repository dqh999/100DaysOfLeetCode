public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        }
        return mergeKListsHelper(
                lists, 0, lists.length - 1
        );
    }
    private ListNode mergeKListsHelper(
            ListNode[] lists,
            int left, int right
    ) {
        if (left == right) {
            return lists[left];
        }
        int mid = left + (right - left) / 2;
        ListNode headLeft = mergeKListsHelper(
                lists,
                left, mid
        );
        ListNode headRight = mergeKListsHelper(
                lists,
                mid + 1, right
        );
        return mergerTwoLists(headLeft, headRight);
    }
    private ListNode mergerTwoLists(
            ListNode l1, ListNode l2
    ) {
        ListNode result = new ListNode(0);
        ListNode cur = result;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                cur.next = l1;
                l1 = l1.next;
            } else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        while (l1 != null) {
            cur.next = l1;
            l1 = l1.next;
            cur = cur.next;
        }
        while (l2 != null) {
            cur.next = l2;
            l2 = l2.next;
            cur = cur.next;
        }
        return result.next;
    }
}