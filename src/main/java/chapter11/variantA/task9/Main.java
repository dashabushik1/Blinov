/**
 * 9. Задана строка, состоящая из символов «(», «)», «[», «]», «{», «}».
 * Проверить правильность расстановки скобок. Использовать стек.
 */
package chapter11.variantA.task9;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        String rightSymbols = "({[{}]})";
        String wrongSymbols = "){})]]";
        System.out.println(isParenthesisMatch(rightSymbols));
        System.out.println(isParenthesisMatch(wrongSymbols));
    }

    public static boolean isParenthesisMatch(String str) {
        Stack<Character> stack = new Stack<>();
        char c;
        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (stack.empty()) {
                return false;
            } else if (c == ')') {
                if (stack.pop() != '(')
                    return false;
            } else if (c == '}') {
                if (stack.pop() != '{')
                    return false;
            } else if (c == ']') {
                if (stack.pop() != '[')
                    return false;
            }
        }
        return stack.empty();
    }
}

