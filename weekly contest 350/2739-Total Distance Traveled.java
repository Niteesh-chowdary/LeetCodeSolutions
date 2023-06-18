class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int val = 0;
        while(mainTank>0){
            if(mainTank>=5){
                mainTank-=5;
                if(additionalTank>0){
                    mainTank+=1;
                    additionalTank-=1;
                }
                
                val++;
            }
            if(mainTank<5) break;
        }
        return val*50+(mainTank*10);
    }
}