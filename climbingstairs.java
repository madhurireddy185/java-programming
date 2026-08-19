package day6;

public class climbingstairs {
public static void main(String[] args) {
    
}
    public int climbStairs(int n) {
       return(n<=0)?0:(n==1)?1:
       (n==2)?2:
       climbStairs(n-1)+climbStairs(n-2);
   }
}
