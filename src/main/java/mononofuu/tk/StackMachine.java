package mononofuu.tk;

import java.util.Stack;

/**
 * created by Alekseichenko Sergey <mononofuu@gmail.com>
 */
public class StackMachine {
    public static final Character MULTIPLY = '*';
    public static final Character PLUS = '+';
    public static final int U12BIT = 4095;

    public int solution(String S) {
        try {

            Stack<String> stack = new Stack<>();

            // iterate over chars of String
            for (int i = 0; i < S.length(); i++) {
                char c = S.charAt(i);

                if (c == MULTIPLY) {
                    int x1 = Integer.valueOf(stack.pop());
                    int x2 = Integer.valueOf(stack.pop());

                    int result = x1 * x2;
                    if (result > U12BIT) {
                        throw new Exception();
                    }

                    stack.push(Integer.toString(result));

                } else if (c == PLUS) {
                    int x1 = Integer.valueOf(stack.pop());
                    int x2 = Integer.valueOf(stack.pop());

                    int result = x1 + x2;
                    if (result > U12BIT) {
                        throw new Exception();
                    }

                    stack.push(Integer.toString(result));
                } else {
                    stack.push(Character.toString(c));
                }
            }

            if (stack.isEmpty()) {
                return -1;
            }

            return Integer.valueOf(stack.pop());

        } catch (java.lang.NumberFormatException exception) {
            return -1;
        } catch (Exception exception) {
            return -1;
        }

    }
}
