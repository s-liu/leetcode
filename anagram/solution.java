public class Solution {
    public List<String> anagrams(String[] strs) {
        Map<String, List<String> > dictionary = new HashMap<String,List<String> >();
        for (String s : strs) {
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String sorted = new String(c);
            List<String> newList = new ArrayList<String>();
            newList.add(s);
            if (dictionary.containsKey(sorted)) {
                newList.addAll(dictionary.get(sorted));
            }
            dictionary.put(sorted, newList);
        }
        List<String> result = new ArrayList<String>();
        for (List<String> l : dictionary.values()) {
            if (l.size() > 1) {
                result.addAll(l);
            }
        }
        return result;
    }
}
