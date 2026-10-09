class Solution {
    public int maxAbsoluteSum(int[] nums) {
    int maxsub = nums[0];
    int minsub = nums[0];
    int maxsum=nums[0];
    int minsum=nums[0];

    for(int i=1; i<nums.length; i++){
      maxsub=Math.max(nums[i],maxsub + nums[i]);

     minsub=Math.min(nums[i],minsub + nums[i]);
     maxsum=Math.max(maxsub,maxsum);
     minsum=Math.min(minsub,minsum);

    }
     return Math.max(maxsum,Math.abs(minsum));

}
}
