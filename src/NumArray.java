public class NumArray {

    private int[] sums;

    public NumArray(int[] nums) {
        if(nums.length != 0){
            sums = new int[nums.length];

            sums[0] = nums[0];
            for(int i=1; i<nums.length; i++){
                sums[i] = nums[i] + sums[i-1];
            }
        }
    }

    public int sumRange(int i, int j) {
        return i==0 ? sums[j] : sums[j]-sums[i-1];
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        NumArray n = new NumArray(arr);
        System.out.println(n.sumRange(0,2));

    }
}
