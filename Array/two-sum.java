class Solution {
    public int[] twoSum(int[] nums, int target) {   
       HashMap<Integer,Integer> a = new HashMap<Integer,Integer>();
       int[] ar=new int[2];
        for(int i=0;i<nums.length;i++ ){
        if(a.containsKey(target-nums[i])){
            ar[1]= i;
            ar[0] =a.get(target-nums[i]);
            break;
        }
        else{
            a.put(nums[i],i);
        }
        }
        return ar;
    }
}v