class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;


        Integer[] indeces = new Integer[n];
        for(int i = 0; i < n; i++){
            indeces[i] = i;
        }
        
        Arrays.sort(indeces, (i,j) -> position[j] - position[i]);

        int fleetCount = 0;
        double prevArrivalTime = 0;

        for(int index : indeces){
            double currArrivalTime = (double)(target - position[index]) / speed[index];
            
            if(currArrivalTime > prevArrivalTime){
                fleetCount++;
                prevArrivalTime = currArrivalTime;
            }

        }
        return fleetCount;
    }
}
