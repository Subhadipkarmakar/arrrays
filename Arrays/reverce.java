public class reverce {
    public static void rev(int numbers[]){
        int frist =0;int last =numbers.length-1;
        while(frist<last){

            int temp=numbers[frist];
            numbers[frist]=numbers[last];
            numbers[last]=temp;
         



            frist++;
            last--;
        }
    }
    public static void main(String args[]){
    int numbers[]={2,4,6,8,10};
rev(numbers);
for(int i=0;i<numbers.length;i++){
    System.out.print(numbers[i]+" ");
}
System.out.println();
    }
}