import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution2 {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> a.val));

        // Thêm phần tử đầu tiên của mỗi danh sách vào heap
        for (ListNode list : lists) {
            if (list != null) {
                minHeap.offer(list);
            }
        }

        // Tạo danh sách kết quả
        ListNode result = new ListNode(0);
        ListNode current = result;

        // Lấy phần tử nhỏ nhất từ heap và thêm vào kết quả
        while (!minHeap.isEmpty()) {
            ListNode node = minHeap.poll(); // Lấy phần tử nhỏ nhất
            current.next = node;            // Thêm vào danh sách kết quả
            current = current.next;         // Di chuyển con trỏ đến phần tử mới thêm

            // Nếu danh sách còn phần tử tiếp theo, thêm vào heap
            if (node.next != null) {
                minHeap.offer(node.next);
            }
        }

        return result.next;
    }
}