class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int ast : asteroids) {
            if (ast > 0) {
                stack.push(ast);
            }
            else {
                while (!stack.isEmpty() && stack.peek() > 0 && stack.peek() < Math.abs(ast)) {
                    stack.pop();
                }

                if (stack.isEmpty() || stack.peek() < 0)  {
                    stack.push(ast);
                }

                if (stack.peek() == Math.abs(ast)) {
                    stack.pop();
                }
            }
        }
        int n = stack.size();
        int[] ans = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            ans[i] = stack.pop();
        }
        return ans;
    }
}
