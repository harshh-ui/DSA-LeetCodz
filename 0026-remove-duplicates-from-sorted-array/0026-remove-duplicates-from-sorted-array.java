class Solution {
    public int removeDuplicates(int[] arr) {
        int j = 1;
        int n = arr.length;
        for(int i = 1; i<n; i++){
            if(arr[i] != arr[i-1]){
                arr[j] = arr[i];
                j++;
            }
        }
        return j;
    }
}