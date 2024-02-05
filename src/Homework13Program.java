import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework13Program {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value of the variable N: ");
        int n = scanner.nextInt();
        System.out.println("Enter the value of the variable M: ");
        int m = scanner.nextInt();
        
        int[][] matrix = new int[n][m];
        int[][] transferMatrix = new int[m][n];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt();
            }
        }
        printMatrix(matrix);

        for (int i = 0; i < transferMatrix.length; i++) {
            for (int j = 0; j < transferMatrix[i].length; j++) {
                transferMatrix[i][j] = matrix[j][i];
            }
        }
        System.out.println("________________________");
        printMatrix(transferMatrix);
    }

    public static void printMatrix(int [][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}
