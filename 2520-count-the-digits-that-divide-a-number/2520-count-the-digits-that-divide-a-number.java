class Solution {
    public int countDigits(int num) {
        int count =0;
        int x= num;
        while(x != 0){
            int last = x % 10;
            if (num % last == 0){
                count++;
            }
            x = x/10;
        }
        return count;
    }
}