package zhiyuan.algorithm.c1;

import zhiyuan.algorithm.base.Stack;

/**
 * Created by mazhiyuan on 2015/4/14.
 */
public class LeftParentheses {
    public String showLeftParentheses(String str) {
        if (str == null || str.equals(""))
            return null;
        Stack<String> items = new Stack<String>();
        Stack<String> operators = new Stack<String>();

        for (String s : str.split(" ")) {
            if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
                operators.push(s);
            } else if (s.equals(")")) {
                String s2 = items.pop();
                String s1 = items.pop();
                String n = new StringBuilder("(").append(" ").append(s1).append(" ").append(operators.pop()).append(" ").append(s2).append(" ").append(s).toString();
                items.push(n);
            } else
                items.push(s);
        }

        return items.pop();
    }

    public static void main(String[] args) {
        System.out.println(new LeftParentheses().showLeftParentheses("1 + 2 ) * 3 - 4 ) * 5 - 6 ) ) )"));
    }
}
