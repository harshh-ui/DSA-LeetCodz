class Solution {
    public int heightChecker(int[] heights) {
        

        int n = heights.length;

        int[] expected = heights.clone();

        
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                if (expected[i] > expected[j]) {
                    int temp = expected[i];
                    expected[i] = expected[j];
                    expected[j] = temp;
                }
            }
        }

        int count = 0;

        
        for (int i = 0; i < n; i++) {
            if (heights[i] != expected[i]) {
                count++;
            }
        }

        return count;
    }
}
