import java.util.*;
class sum{
    public static void main(String args[]){
        int n,i,sum=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the size of the array ");
        n=scan.nextInt();
        int[] arr=new int[20];
        System.out.println("Enter the elemnts of the array ");
        for(i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        for(i=0;i<n;i++){
            sum=sum+arr[i];
        }
        System.out.println("The sum is "+sum);

    }
}