class Solution {
    public boolean isPalindrome(int x) {
        int temp=0;
        int r=0;
        int var=x;
        while(var>0){
           r=var%10;
           temp=(temp*10)+r;
           var=var/10;
        }
       
       // int result=temp/10;
      System.out.println(x);
       System.out.println(temp);
      return x==temp;
    }
}