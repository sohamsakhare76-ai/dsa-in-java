class Solution {
    List< List<Integer>> result = new ArrayList<>();
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
       List<Integer> currentList = new ArrayList<>();
      
     
      backtracking(0, currentList, target,candidates);
      return result;
       

    }
     void backtracking(int i,  List<Integer> currentList,int rem,int[] candidates ){
          if(rem==0){
            result.add( new ArrayList<>(currentList));
          }
          if(rem < 0){
            return ;
          }
         for(int j =i; j<candidates.length;j++){
                currentList.add(candidates[j]);
                backtracking(j,currentList,rem - candidates[j],candidates);
                currentList.remove(currentList.size()-1);
         }

       }
}
