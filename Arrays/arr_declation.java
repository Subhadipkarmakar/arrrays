import java.util.*;
public class arr_declation{
    public static void main(String args[]){
    int marks[]=new int [100];
    // int numbers[]={1,2,3};
    // int morenumbers[]={4,5,6};
    // String fruits[]={"apple","mango","orrange"};
    Scanner sc=new Scanner(System.in);
    marks[0]=sc.nextInt();
    marks[1]=sc.nextInt();
    marks[2]=sc.nextInt();
    System.out.println("phy :"+marks[0]);
    System.out.println("chem :"+marks[1]);
    System.out.println("math :"+marks[2]);
    marks[2]=marks[2]+1;
    System.out.println("math :"+marks[2]);
}
}