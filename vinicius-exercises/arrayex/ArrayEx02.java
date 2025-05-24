package arrayex;

public class ArrayEx02 {
    public static void main(String[] args) {
        int[] nums = {12,3,2,4,6,88,2,5};
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            sum = nums[i]+sum;
        }
        System.out.println(sum);
    }
}
