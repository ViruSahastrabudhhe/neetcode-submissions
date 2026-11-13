class Solution {
    public boolean isValid(String input) {
        Deque<String> stack = new ArrayDeque<>();
        boolean check = false;
        for (int i = 0; i<input.length(); i++) {
            String currentChar = String.valueOf(input.charAt(i));
            if (currentChar.equals("(") || currentChar.equals("{") || currentChar.equals("[")) {
                stack.push(currentChar);
                continue;
            }
            if (currentChar.equals(")")) {
                if (stack.isEmpty()) {
                    check = false;
                    break;
                }
                if (!stack.peek().equals("(")) {
                    check = false;
                    break;
                }
                stack.pop();
                check=true;
            }
            if (currentChar.equals("}")) {
                if (stack.isEmpty()) {
                    check = false;
                    break;
                }
                if (!stack.peek().equals("{")) {
                    check = false;
                    break;
                }
                stack.pop();
                check=true;
            }
            if (currentChar.equals("]")) {
                if (stack.isEmpty()) {
                    check = false;
                    break;
                }
                if (!stack.peek().equals("[")) {
                    check = false;
                    break;
                }
                stack.pop();
                check=true;
            }
        }
        return check && stack.isEmpty();
    }
}
