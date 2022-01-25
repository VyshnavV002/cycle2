import java.util.*;
public class transpose {
    public static void main(String args[]){
        int n,m,i,j;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the no.of rows ");
        n=scan.nextInt();
        System.out.println("Enter the no of coloumns ");
        m=scan.nextInt();
        int[][] arr=new int[n][m];
        int[][] arr2=new int[m][n];
        System.out.println("Enter the array ");
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){

                arr[i][j]=scan.nextInt();
            }
        }
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                arr2[i][j]=arr[j][i];
            }
        }
        System.out.println("The transpose is ");
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }

    }
}
