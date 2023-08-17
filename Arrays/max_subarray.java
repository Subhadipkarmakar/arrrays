public class max_subarray {
    public static void max_sumsubarrays(int numbers[]){
        int curr_sum=0;
        int Max_sum=Integer.MIN_VALUE;
    for(int i=0;i<numbers.length;i++){
        int start=i;
        for(int j=i;j<numbers.length;j++){
            int end=j;
            curr_sum=0;
            for(int k=start;k<=end;k++){
               curr_sum+=numbers[k];

            }
            System.out.println(curr_sum);
            if(Max_sum<curr_sum){
                Max_sum=curr_sum;
            }
        }
    }
      System.out.println("max sum is : "+Max_sum);  
    }
    public static void main(String args[]){
        int numbers[] = { 2, 4, 6, 8, 10 };
        max_sumsubarrays(numbers);
    }
}
 