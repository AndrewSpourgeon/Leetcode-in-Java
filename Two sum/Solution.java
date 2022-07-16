class Solution {
    int start=0;
   public int[] twoSum(int[] nums, int target) {
       int count=0;
       int size=nums.length;
       int end=size-1;
       int[] result=new int[2];
       int i=start+1;
       while(i<=end || start<end){
           if(nums[start]+nums[i]==target){
               result[0]=start;
               result[1]=i;
               break;
           }
           count++;
           if(count==(end-(start+1)+1)){
               start++;
               i=start;
               count=0;
           }
           i++;
       }
       
      return result; 
   }
}