class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, List<String>> stringMap = new HashMap<>();

        for(String word : strs){
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedKey = new String(chars);
            stringMap.computeIfAbsent(sortedKey, k -> new ArrayList<>()).add(word);
        }

        return new ArrayList<>(stringMap.values());
    }
}