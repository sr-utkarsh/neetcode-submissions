class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm = new HashMap<>( );
        int [] res = new int[2];
        hm.put(nums[0],0);
        for(int i = 1;i<nums.length;i++){
            if(hm.containsKey(target-nums[i])){
                res[0]=hm.get(target-nums[i]);
                res[1]=i;
                return res;
            }
            else{
                hm.put(nums[i],i);
            }
        }
        return res;
    }
}
