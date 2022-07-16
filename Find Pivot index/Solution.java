class Solution {
    public int pivotIndex(int[] nums) {
        int i=0;
        int pivot=-1;
        int size=nums.length;
        while(i<size){
             int temp=0;
             int flag=0;
            if(i==0){
               
               for(int j=1;j<size;j++){
                   temp+=nums[j];
               }
                if(temp==0){
                    pivot=0;
                    break;
                }
            }
            else if(i==size-1){
                for(int j=0;j<size-1;j++){
                   temp+=nums[j];
               }
                if(temp==0){
                    pivot=size-1;
                }
            }
            else{
                for(int m=0;m<i;m++){
                    temp=temp+nums[m];
                }
                for(int n=i+1;n<=size-1;n++){
                    flag=flag+nums[n];
                }
                if(temp==flag){
                    pivot=i;
                    break;
                }
            }
            
            i++;
        }
       return pivot; 
    }
}