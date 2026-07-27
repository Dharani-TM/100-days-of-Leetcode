import java.util.*;

public class Day10{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }

        int target = sc.nextInt();

        Arrays.sort(nums);

        int closest = nums[0] + nums[1] + nums[2];

        for(int i=0;i<n-2;i++){

            int left=i+1;
            int right=n-1;

            while(left<right){

                int sum=nums[i]+nums[left]+nums[right];

                if(Math.abs(sum-target)<Math.abs(closest-target)){
                    closest=sum;
                }

                if(sum<target){
                    left++;
                }
                else if(sum>target){
                    right--;
                }
                else{
                    System.out.println(sum);
                    return;
                }
            }
        }

        System.out.println(closest);
    }
}