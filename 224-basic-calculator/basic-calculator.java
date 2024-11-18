class Solution {
    public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int sign = 1; // 1 == '+' or -1 == '-'
        int result = 0;
        int num = 0;


        for(int index = 0; index < s.length(); index++) {
            char c = s.charAt(index);

            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0');
            } else if (c == '+') {
                result += sign * num;
                num = 0;
                sign = 1;
            } else if (c == '-') {
                result += sign * num;
                num = 0;
                sign = -1;
            } else if (c == '(') {
                stack.push(result);
                stack.push(sign);
                result = 0;
                sign = 1;
            } else if (c == ')') {
                result += sign * num;
                num = 0;
                
                result *= stack.pop();
                result += stack.pop();
            }
        }   

        result += sign * num;

        return result;
    }
}