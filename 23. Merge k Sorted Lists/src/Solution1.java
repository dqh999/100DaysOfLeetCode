public class Solution1 {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }
        return mergeKListsHelper(lists, 0, lists.length - 1);
    }

    private ListNode mergeKListsHelper(ListNode[] lists, int left, int right) {
        // Nếu chỉ có một danh sách, trả về chính nó
        if (left == right) {
            return lists[left];
        }

        // Chia danh sách thành hai nửa
        int mid = left + (right - left) / 2;

        // Merge hai nửa đệ quy
        ListNode leftMerged = mergeKListsHelper(lists, left, mid);
        ListNode rightMerged = mergeKListsHelper(lists, mid + 1, right);

        // Trả về kết quả của việc merge hai nửa
        return mergeTwoLists(leftMerged, rightMerged);
    }

    private ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // Merge hai danh sách đã sắp xếp
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }

        // Nếu còn phần tử trong l1 hoặc l2, thêm vào kết quả
        if (l1 != null) {
            current.next = l1;
        } else {
            current.next = l2;
        }

        return dummy.next;
    }
}