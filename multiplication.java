import java.util.*;
class multiplication{
    public static void main(String args[]){
        int i,j,n,m;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the no of rows ");
        n=scan.nextInt();
        System.out.println("Enter the no of coloumns ");
        m=scan.nextInt();
        int[][] arr1=new int[n][m];
        int[][] arr2=new int[n][m];
        int[][] multi=new int[n][m];
        System.out.println("Enter the elements of the array ");
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                arr1[i][j]=scan.nextInt();
            }
        }
        System.out.println("Enter the elemnts of the next array ");
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                arr2[i][j]=scan.nextInt();
            }
        }
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
            for(int k=0;k<n;k++){    
            multi[i][j]=arr1[i][k]*arr2[k][j];
            }
        }}
        System.out.println("The result is ");
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                System.out.print(multi[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
