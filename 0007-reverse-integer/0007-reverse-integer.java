class Solution {
    public int reverse(int x) {
        double rev=0;
        while(x!=0){
            int dig=x%10;
            rev=rev*10+dig;
            x=x/10;
        }
        if(rev>Math.pow(2,31)||(rev<Math.pow(-2,31))){
            return 0;
        }
        return (int)rev;
    }
}
    
    
