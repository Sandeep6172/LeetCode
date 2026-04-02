class Solution {
    List<List<Integer>>res;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        res=new ArrayList<>();
        check(candidates,0,target,new ArrayList<>());
        return res;
       // this.target=target
        
    }
    void check(int []nums,int i, int target,ArrayList<Integer> arr){
        if (target==0){
            res.add(new ArrayList<>(arr));
            return;
        }
        if(target<0 || i==nums.length) return;
        arr.add(nums[i]);
        check(nums,i,target-nums[i],arr);
        arr.remove(arr.size()-1);
        check(nums,i+1,target,arr);
    }
}