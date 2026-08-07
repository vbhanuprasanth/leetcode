class Solution {
    public int maximumPrimeDifference(int[] nums) {
        boolean isFirst = true;
        int x = 0; int y = 0;

        for(int i = 0;i<nums.length;i++){
            if(isPrime(nums[i])){
                if(isFirst){
                    x = i;
                    y = i;
                    isFirst = false;
                } else{
                    y = i;
                }
            }
        }
        return y-x;
    }

    public boolean isPrime(int n){
        if(n <= 1) return false;
        for(int i = 2;i*i<=n;i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}