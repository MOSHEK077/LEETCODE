class Solution {
    public int[] twoSum(int[] nums, int target) {
        //System.out.println(nums,target);
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length;i++){
            //cur + x = target;
            //x = target - cur ;
            int cur = nums[i];
            int x = target - cur;
            if(map.containsKey(x)){
                return new int[] {map.get(x),i};

            }
        
        map.put(cur,i);
        }
        return null;

    }
}