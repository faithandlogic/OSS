public boolean noTriples(int[] nums) {
    if (nums.length<3){
      return true;
    }
    for(int i = 0; i < nums.length-1; i++){
      if(nums[i+1] == nums[i] && nums[i+2] == nums[i]) return false;
    }
    return true;
}
  