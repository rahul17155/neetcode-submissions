class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Map<Integer,Integer>carFleet=new TreeMap<>();
        int k=0;
        float time[]=new float[position.length];
        for(int i=0;i<position.length;i++){
            carFleet.put(position[i],speed[i]);
        }
        for(Map.Entry<Integer,Integer>e:carFleet.entrySet()){
            int ke=e.getKey();
            int val=e.getValue();
            float ti=(float)(target-ke)/val;
            time[k]=ti;
            k++;
        }
        Stack<Float>tim=new Stack<>();
        System.out.print(time[position.length-1]);
        int result=1;
        float curr_val=time[position.length-1];
        for(int i=position.length-2;i>=0;i--){
            System.out.print(time[i]);
            if(time[i]>curr_val){
                result++;
                curr_val=time[i];
            }
        }
        return result;

    }
}
