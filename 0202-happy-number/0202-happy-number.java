class Solution {
    public boolean isHappy(int n) {
        if (n<0) {
            return false;
        }
        while (n!=4){
            int sum = 0;
            while (n!=0){
                int last = n % 10;
                sum+= last*last;
                n = n/10;
            }
            if(sum==1){
                return true;
            } else {
                n=sum;
            }
        }
        return false;
    }
}