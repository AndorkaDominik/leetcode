/*
Given an integer n, return true if it is a power of two. Otherwise, return false.

An integer n is a power of two if there exists an integer x such that n==2^x

Example 1:
Input: n=1
Output: true
Expl: 2^0 = 1

Example 2:
Input: n=16
Output: true
Expl: 2^4 = 16

Example 3:
Input: n=3
Output: false
*/
class Main {
    public static boolean isPowerOfTwo(int n){
        int power = 1;
        while(power<=n){
            if(power == n)
                return true; 
            power*=2;
        }
        return false;
    }
    
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(3));
    }
}
