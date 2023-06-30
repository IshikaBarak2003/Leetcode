public String removeDuplicates(String s) {
        Stack<Character> stk = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            while (!stk.isEmpty() && stk.peek() == s.charAt(i)) {
                stk.pop();
            }
            stk.push(s.charAt(i));
        }
        StringBuilder str = new StringBuilder();
        while (!stk.isEmpty()) {
            str.append(stk.pop());
        }
        return str.toString();
    }
}
