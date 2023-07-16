class Solution {
    public boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }

        if (s.equals(goal)) {
            Set<Character> uniqueChars = new HashSet<>();
            for (char c : s.toCharArray()) {
                uniqueChars.add(c);
            }
            return uniqueChars.size() < s.length();
        }

        List<Integer> diffs = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != goal.charAt(i)) {
                diffs.add(i);
            }
        }

        return diffs.size() == 2 && s.charAt(diffs.get(0)) == goal.charAt(diffs.get(1))
                && s.charAt(diffs.get(1)) == goal.charAt(diffs.get(0));
    }
}
