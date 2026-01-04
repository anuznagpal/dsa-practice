class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tGas = 0, tCost =0;
        int start =0;
        int cCost =0;
        for(int i=0; i<gas.length; i++){
            tGas+=gas[i];
            tCost+=cost[i];
            cCost+=(gas[i]-cost[i]);
            if(cCost<0){
                start=i+1;
                cCost =0;
            }

        }
        return tGas<tCost?-1:start;
    }
}