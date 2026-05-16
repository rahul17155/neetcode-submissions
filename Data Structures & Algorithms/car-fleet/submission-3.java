class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        // Map<Integer,Integer>carFleet=new TreeMap<>();
        // int k=0;
        // float time[]=new float[position.length];
        // for(int i=0;i<position.length;i++){
        //     carFleet.put(position[i],speed[i]);
        // }
        // for(Map.Entry<Integer,Integer>e:carFleet.entrySet()){
        //     int ke=e.getKey();
        //     int val=e.getValue();
        //     float ti=(float)(target-ke)/val;
        //     time[k]=ti;
        //     k++;
        // }
        // Stack<Float>tim=new Stack<>();
        // System.out.print(time[position.length-1]);
        // int result=1;
        // float curr_val=time[position.length-1];
        // for(int i=position.length-2;i>=0;i--){
        //     System.out.print(time[i]);
        //     if(time[i]>curr_val){
        //         result++;
        //         curr_val=time[i];
        //     }
        // }
        // return result;
        int len=position.length;
        int[][] pair=new int[len][2];
        for(int i=0;i<len;i++){
            pair[i][0]=position[i];
            pair[i][1]=speed[i];
        }
        Arrays.sort(pair,(a,b)->Integer.compare(a[0],b[0]));
        int fleet=1;
        float curr=(float)(target-pair[len-1][0])/pair[len-1][1];
        for(int i=len-2;i>=0;i--){
            float prev=(float)(target-pair[i][0])/pair[i][1];
            if(prev>curr){
                fleet++;
                curr=prev;
            }
        }
        return fleet;
    }
}
