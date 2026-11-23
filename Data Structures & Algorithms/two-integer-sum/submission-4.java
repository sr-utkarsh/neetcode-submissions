class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int [] res = new int [2];
        for(int i =0;i<nums.length;i++){
            if(hm.get(target-nums[i])!=null)
            {
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
