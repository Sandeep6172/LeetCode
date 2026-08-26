class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        Set<String> set = new HashSet<>(dictionary);
        StringBuilder ans = new StringBuilder();

        for (String word : sentence.split(" ")) {
            String root = word;

            for (int i = 1; i <= word.length(); i++) {
                if (set.contains(word.substring(0, i))) {
                    root = word.substring(0, i);
                    break;
                }
            }

            ans.append(root).append(" ");
        }

        return ans.toString().trim();
        
    }
}