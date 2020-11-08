package Problem2;

public class SortList {
    private static final int SENTRY = Integer.MAX_VALUE;
    // DO NOT ADD ANY NEW MEMBER VARIABLE AND MEMBER FUNCTION

    // DO NOT CHANGE ANYTHING IN THIS FUNCTION
    public static ListNode sortList(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        ListNode mid = findMidAndBreak(head);
        return mergeLists(sortList(head), sortList(mid));
    }

    public static ListNode findMidAndBreak(ListNode head) {
        // homework
        if(head == null || head.next == null) return null;
        int length = 1;
        ListNode pointer = head;
        while(pointer.next != null) {
            length++;
            pointer = pointer.next;
        }
        int mid = length / 2;
        pointer = head;
        for(int i = 0; i < mid-1; i++)
            pointer = pointer.next;
        ListNode temp = pointer.next;
        pointer.next = null;
        return temp;
    }
    public static ListNode mergeLists(ListNode list1, ListNode list2) {
        // homework
        if (list1 == null) return list2;
        if (list2 == null) return list1;
        ListNode point1 = list1;
        ListNode point2 = list2;
        ListNode newList;
        if(list1.val < list2.val){ newList = list1; point1 = point1.next; }
        else { newList = list2; point2 = point2.next; }
        newList.next = null;
        ListNode newPoint = newList;
        while (point1 != null && point2 != null)
        {
            if(point1.val < point2.val)
            {
                newPoint.next = point1;
                point1 = point1.next;
            } else {
                newPoint.next = point2;
                point2 = point2.next;
            }
            newPoint = newPoint.next;
        }
        if (point1 != null)
            newPoint.next = point1;
        if (point2 != null)
            newPoint.next = point2;
            return newList;
    }
}
