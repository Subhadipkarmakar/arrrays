public class max_subarrays2 {
    public static void max_sumsubarrays(int numbers[]){
        int curr_sum=0;
        int Max_sum=Integer.MIN_VALUE;
        int prefix[]=new int [numbers.length];
        //calculate prefix array
        prefix[0]=numbers[0];
        for(int i=1;i<=prefix.length;i++){
            prefix[i]=prefix[i-1]+numbers[i];
        }
    for(int i=0;i<numbers.length;i++){
        int start=i;
        for(int j=i;j<numbers.length;j++){
            int end=j;
            curr_sum=0;
           
            curr_sum=start==0 ? prefix[end]:prefix[end]-prefix[start-1];
            if(Max_sum<curr_sum){
                Max_sum=curr_sum;
            }
        }
    }
      System.out.println("max sum is : "+Max_sum);
}
    public static void main(String args[]){
    int numbers[]={1,-2,6,-1,3};
    max_sumsubarrays(numbers);
    }
} 

