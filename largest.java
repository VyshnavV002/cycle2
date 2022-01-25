import java.util.*;
public class largest {
    public static void main(String args[]){
        int i,j,large,m,n;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the no of rows ");
        n=scan.nextInt();
        System.out.println("Enter the no of coloumns ");
        m=scan.nextInt();
        int[][] arr=new int[m][n];
        System.out.println("Enter the elements ");
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                arr[i][j]=scan.nextInt();
            }
        }large=arr[0][0];
        for(i=1;i<n;i++){
            for(j=1;j<m;j++){
                if(arr[i][j]>large){
                    large=arr[i][j];
                }
            }

        }
        System.out.println("The largest element is "+large);

        
    }
}
