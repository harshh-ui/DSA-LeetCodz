class Solution {
    public int shipWithinDays(int[] weights, int days) {
        

        int low = 0;
        int high = 0;

        
        for (int i = 0; i < weights.length; i++) {
            low = Math.max(low, weights[i]);
            high = high + weights[i];
        }

        
        while (low <= high) {

            int mid = (low + high) / 2;

            int sum = 0;
            int countDays = 1;

            
            for (int i = 0; i < weights.length; i++) {

                if (sum + weights[i] <= mid) {
                    sum = sum + weights[i];
                } 
                else {
                    countDays++;
                    sum = weights[i];
                }
            }

            
            if (countDays > days) {
                low = mid + 1;
            }

           
            else {
                high = mid - 1;
            }
        }

        return low;
    }
}
    
