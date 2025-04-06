class Solution {
    public int divide(int dividend, int divisor) {
        double x= dividend,y=divisor;
        if(x==y){
            return 1;
        }
        if(y==1){
            return (int)x;
        }
        int res=(int)Math.floor(x/y);
        if(res<0&&x%y!=0){
            return res+1;
        }
        return res;
    }
}