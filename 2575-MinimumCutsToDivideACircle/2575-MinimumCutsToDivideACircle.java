// Last updated: 09/02/2026, 13:56:36
class Solution {
    public int numberOfCuts(int n) {
        if(n==1){
            return 0;
        }
       if(n%2==0){
        return n/2;
       }
        return n;
        }
        
    }
