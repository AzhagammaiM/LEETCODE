class Solution {
    public int reverse(int x) {
        int ans=0;
            int isnagative=0;
            if(x<0){
            x=-x;
            isnagative=1;
            }
        while(x>0){
            int rem=x%10;
              if (ans > (Integer.MAX_VALUE - rem) / 10) {
                return 0;  // overflow detected, return 0 as per LeetCode problem convention
            }

                ans=ans*10+rem;
            x/=10;
            
        }
        if(isnagative==1)return (-1)*ans;
        return ans;
    }
}