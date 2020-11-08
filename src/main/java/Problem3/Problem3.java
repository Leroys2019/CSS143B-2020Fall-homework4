package Problem3;

import Problem2.ListNode;

import java.io.PrintStream;

public class Problem3 {
    public static void printListInReverse(ListNode list, PrintStream print) {
        // homework

        if(list == null)
            return;
        toPrint(list, print);
    }
    public static void toPrint(ListNode list, PrintStream print)
    {
        if(list.next == null)
        {
            print.print(list.val + " ");
            return;
        }
        toPrint(list.next, print);
        print.print(list.val + " ");
    }
}