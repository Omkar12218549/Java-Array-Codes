package Array;

public class AnonymoousArray {
    public int add(int[] nums){
        int result=0;
        for(int i=0;i<nums.length;i++){
            result+=nums[i];

        }
        return result;
    }

    public static void main(String[] args) {
        AnonymoousArray obj=new AnonymoousArray();
        int result=obj.add(new int[]{12,12,2,3});
        System.out.println(result);
    }
}
