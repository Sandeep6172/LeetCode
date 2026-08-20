class Solution {
    public double averageWaitingTime(int[][] customers) {
        ArrayList<Integer> list= new ArrayList<>();
        int curr[]=customers[0];
        int sum=curr[0]+curr[1];
        list.add(sum-curr[0]);
        for(int i=1;i<customers.length;i++){
            curr=customers[i];
            if(sum<curr[0]){
            sum=curr[0];
        }
        sum=sum+curr[1];
        list.add(sum-curr[0]);
        }
        long avg=0;
        for(int i:list){
            avg=avg+i;
        }
        return(double)avg/list.size();



        
    }
}