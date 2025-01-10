import java.util.HashMap;
import java.util.Map;

class Solution {
    private Map<String, Integer> addTwoNumbers(
            int number1,
            int number2
    ){
        Map<String, Integer> result = new HashMap<>();
        result.put("carry", (number1 + number2) % 10);
        result.put("result", number1 + number2);
        return result;
    };
    public ListNode addTwoNumbers(
            ListNode l1,
            ListNode l2
    ) {
        ListNode dummyHead  = new ListNode(0);
        var result1 = addTwoNumbers(l1.val, l2.val);
        int carry = result1.get("carry");
        dummyHead.val = result1.get("result");
        while (l1.next != null && l2.next != null) {
            var resultNext = addTwoNumbers(l1.next.val, l2.next.val);

        }
        return dummyHead.next;
    }
}