class Solution {
     String[] map = {
        "", "", "abc", "def", "ghi", "jkl",
        "mno", "pqrs", "tuv", "wxyz"
    };
    List<String> ans = new ArrayList<>();

    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) return ans;

        solve(digits, 0, "");
        return ans;
        
    }
     void solve(String d, int i, String s) {
        if (i == d.length()) {
            ans.add(s);
            return;
        }

        String letters = map[d.charAt(i) - '0'];

        for (char c : letters.toCharArray()) {
            solve(d, i + 1, s + c);
        }
    }
}