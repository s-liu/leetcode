public class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> code = new ArrayList<Integer>();
        code.add(0);
        if (n <= 0) {
            return code;
        }
        code.add(1);
        
        for (int i = 1; i < n; i++) {
            int prefix = 1 << i;
            for (int j = code.size()-1; j >= 0; j--) {
                code.add(code.get(j) + prefix);
            }
        }
        
        return code;
    }
}
