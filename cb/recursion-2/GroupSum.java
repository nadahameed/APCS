public class GroupSum{
  public boolean groupSum(int start, int[] nums, int target){
    if(target == 0){
      return true;
    }
    if(start == nums.length){
      return false;
    }
    //looks through nums by adding 1 to start every time, and makes sure that by taking away from the target with nums, you can reach 0
    if(groupSum(start + 1, nums, target - nums[start])){
      return true;
    }
    return groupSum(start + 1, nums, target);
  }

  public static void main(String[] args){
    GroupSum baby = new GroupSum();
    int[] n = new int[]{2,4,8};
    System.out.println(baby.groupSum(0, n, 10)); //t
    System.out.println(baby.groupSum(0, n, 14)); //t
    System.out.println(baby.groupSum(0, n, 9)); //f
  }
}
