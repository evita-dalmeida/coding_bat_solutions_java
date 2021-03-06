//Given an array of ints, is it possible to choose a group of some of the ints, such that the group sums to the given target? 
//This is a classic backtracking recursion problem. Once you understand the recursive backtracking strategy in this problem, you can use the same pattern for many problems to search a space of choices. 
//Rather than looking at the whole array, our convention is to consider the part of the array starting at index start and continuing to the end of the array. 
//The caller can specify the whole array simply by passing start as 0. No loops are needed -- the recursive calls progress down the array.

public boolean groupSum(int start, int[] nums, int target) {
    int result = 0;
    for(int i = start; i< nums.length; i++){
      result += nums[i];
      if(groupSum(start+1, nums, target))
        return true;
    }
    if(result == target)
        return true;
    return false;
  }

  //Given an array of ints, is it possible to choose a group of some of the ints, beginning at the start index, such that the group sums to the given target? 
  //However, with the additional constraint that all 6's must be chosen. (No loops needed.)

  public boolean groupSum6(int start, int[] nums, int target) {
    if(start == nums.length)
          return target == 0;
            
      if(nums[start] == 6)
          return groupSum6(start+1, nums, target - 6);
                      
      if(groupSum6(start+1, nums, target) || groupSum6(start+1, nums, target - nums[start]))
          return true;
  
                                          
      return false;
  }

  //Given an array of ints, is it possible to choose a group of some of the ints, such that the group sums to the given target with this additional constraint: 
  //If a value in the array is chosen to be in the group, the value immediately following it in the array must not be chosen. (No loops needed.)

  public boolean groupNoAdj(int start, int[] nums, int target) {
    if(start >= nums.length)
      return target == 0;
  
    if(groupNoAdj(start+1, nums, target) || groupNoAdj(start+2, nums, target - nums[start]))
      return true;
    return false;
  }

  //Given an array of ints, is it possible to choose a group of some of the ints, such that the group sums to the given target with these additional constraints: 
  //all multiples of 5 in the array must be included in the group. If the value immediately following a multiple of 5 is 1, it must not be chosen. (No loops needed.)

  