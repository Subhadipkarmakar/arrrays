public class kadanes {
    public static void kadansalgo(int numbers[]){
        int ms=Integer.MIN_VALUE;
        int cs=0;
        for(int i=0;i<numbers.length;i++){
cs+=numbers[i];
if(cs<0){
    cs=0;
}
ms=Math.max(cs, ms);
        }
        System.out.println("our maxs subarrays sum is"+ms);
    }
    public static void main(String args[]){
    //int numbers[]={-2,-3,4,-1,-2,1,5,-3};
    int numbers[]={1,-2,6,-1,3};
    kadansalgo(numbers);
    }
}
