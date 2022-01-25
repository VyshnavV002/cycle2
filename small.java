import java.util.*;
public class small {
    public static void main(String args[]){
        int n,i,small;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the size of the array ");
        n=scan.nextInt();
        int[] arr=new int[20];
        System.out.println("Enter the elements of the array ");
        for(i=0;i<n;i++){
           arr[i]=scan.nextInt();
        }
        small=arr[0];
        for(i=1;i<n;i++){
            if(arr[i]<small){
                small=arr[i];

            }

        }
        System.out.println("The smallest elemnt is "+small);
    }
}
