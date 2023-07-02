public String removeDuplicates(String s) {
        int i = 0, n = s.length();
        char[] res = s.toCharArray();
        for (int j = 0; j < n; ++j, ++i) {
            res[i] = res[j];
            if (i > 0 && res[i - 1] == res[i]) // count = 2
                i -= 2;
        }
        return new String(res, 0, i);
    }
}

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
