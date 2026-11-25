class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ArrayList<Integer> alist = new ArrayList<>();

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                alist.add(list1.val);
                list1 = list1.next;
            } else {
                alist.add(list2.val);
                list2 = list2.next;
            }
        }

        while (list1 != null) {
            alist.add(list1.val);
            list1 = list1.next;
        }

        while (list2 != null) {
            alist.add(list2.val);
            list2 = list2.next;
        }

        ListNode head = new ListNode(0);
        ListNode tail = head;

        for (int num : alist) {
            tail.next = new ListNode(num);
            tail = tail.next;
        }

        return head.next;
    }
}