class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        HashMap<Integer, List<String>> map = new HashMap<>();

        for (String s : strs) {
            int score = calculateScore(s);
            if (map.containsKey(score)) {
                map.get(score).add(s); // Add the word to the corresponding anagram group
            } else {
                List<String> group = new ArrayList<>();
                group.add(s);
                map.put(score, group);
            }
        }

        // Add all the anagram groups to the result list
        result.addAll(map.values());

        return result;
    }

    private int calculateScore(String word) {
        int[] freq = new int[26];
        for (char c : word.toCharArray()) {
            freq[c - 'a']++;
        }

        // Combine the frequencies to create a unique score for each anagram group
        int score = 0;
        for (int i = 0; i < 26; i++) {
            score = score * 31 + freq[i];
        }
        return score;
    }
}

