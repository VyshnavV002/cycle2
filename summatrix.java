import java.util.*;

public class summatrix {
public static void main(String args[]){
    int i,j,m,n;
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the no of rows  ");
    n=scan.nextInt();
    System.out.println("Enter the no of coloumns ");
    m=scan.nextInt();
    int[][] arr1=new int[n][m];
    int[][] arr2=new int[n][m];
    int[][] sum=new int[n][m];
    System.out.println("Enter the elements of first matrix ");
    for(i=0;i<n;i++){
        for(j=0;j<m;j++){
            arr1[i][j]=scan.nextInt();
        }
    }
    System.out.println("Enter the elements of second matrix ");
    for(i=0;i<n;i++){
        for(j=0;j<m;j++){
            arr2[i][j]=scan.nextInt();
        }
    }
    for(i=0;i<n;i++){
        for(j=0;j<m;j++){
            sum[i][j]=arr1[i][j]+arr2[i][j];
        }
    }
    for(i=0;i<n;i++){
        for(j=0;j<m;j++){
            System.out.print(sum[i][j]+" ");
        }
        System.out.println("");
    }
}

    
}
