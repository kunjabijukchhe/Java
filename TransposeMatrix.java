import java.util.Scanner;
 
public class TransposeMatrix
{
   public static void main(String args[])
   {
      int m, n, c, d;
 
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the number of rows and columns of matrix");
      m = input.nextInt();
      n = input.nextInt();
 
      int matrix[][] = new int[m][n];
     
      System.out.println("Enter the elements of matrix");
 
      for (int i = 0; i < m; i++){
         for (int j = 0; j < n; j++){
            matrix[i][j] = input.nextInt();
        }
    }
    System.out.println("Input value of matrix are:");
      for (int i = 0; i < m; i++){
         for (int j = 0; j < n; j++){
             
            System.out.print(matrix[i][j]+"\t");
        }
        System.out.print("\n");
    }
      int transpose[][] = new int[n][m];
     
      for (int i = 0; i < m; i++){
         for (int j = 0; j < n; j++){       
            transpose[j][i] = matrix[i][j];
        }
    }
      System.out.println("Transpose of the matrix:");
 
      for (int i = 0; i < m; i++){
         for (int j = 0; j < n; j++){
               System.out.print(transpose[i][j]+"\t");
            }
         System.out.print("\n");
      }
   }
}