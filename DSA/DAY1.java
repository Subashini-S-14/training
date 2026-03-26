class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
}




class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        for(int i=0;i<s.length();i++){
            Set<Character>c=new HashSet<>();
            for(int j=i;j<s.length();j++){
               char ch=s.charAt(j);
               if(c.contains(ch)){
                break;
               }
               c.add(ch);
               max=Math.max(max,j-i+1);
            }  
        }
        return max;
    }
}