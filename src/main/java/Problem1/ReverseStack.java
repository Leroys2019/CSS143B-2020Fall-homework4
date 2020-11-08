package Problem1;

import java.util.Stack;

public class ReverseStack {
    public static void reverseStack(Stack<Integer> stack) {
        // homework
            if(stack.isEmpty()) return;
            int temp = stack.pop();
            reverseStack(stack);
            Insert(temp, stack);
        }
        private static void Insert(int temp, Stack<Integer> stack)
        {
            if(stack.isEmpty())
            {
                stack.push(temp);
                return;
            }
            int first = stack.pop();
            Insert(temp, stack);
            stack.push(first);
        }
    }