class Solution {
    public int countPrimeSetBits(int left, int right) {
        int res = 0;
         for(int i = left;i < right + 1;i++){
             int bits =  Integer.bitCount(i);
             if(isPrime(bits)){
                 res++;
             }
             
         }
        return res;
    }
    public boolean isPrime(int n)
    {
        // Corner case
        if (n <= 1)
            return false;
  
        // Check from 2 to n-1
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;
  
        return true;
    }
}
