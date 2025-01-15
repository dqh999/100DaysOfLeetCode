
public class Main {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(3);
        l1.next.next = new ListNode(5);
        l1.next.next.next = new ListNode(7);

        ListNode l2 = new ListNode(2);
        l2.next = new ListNode(4);
        l2.next.next = new ListNode(6);
        l2.next.next.next = new ListNode(8);

        ListNode l3 = new ListNode(10);
        l3.next = new ListNode(12);

        ListNode l4 = new ListNode(0);
        l4.next = new ListNode(9);

        ListNode l5 = new ListNode(15);
        l5.next = new ListNode(20);

        ListNode l6 = new ListNode(3);
        l6.next = new ListNode(8);
        l6.next.next = new ListNode(9);

        ListNode l7 = new ListNode(5);
        l7.next = new ListNode(10);

        ListNode l8 = new ListNode(1);
        l8.next = new ListNode(4);
        l8.next.next = new ListNode(9);

        ListNode l9 = new ListNode(7);
        l9.next = new ListNode(13);
        l9.next.next = new ListNode(14);

        ListNode l10 = new ListNode(11);
        l10.next = new ListNode(16);

        // Add all lists to the array
        ListNode[] lists = new ListNode[]{l1, l2, l3, l4, l5, l6, l7, l8, l9, l10};

        Solution solution = new Solution();
        ListNode result = solution.mergeKLists(lists);

        // Print the result
        System.out.println("Merged List:");
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }

}
