import java.util.Scanner;

public class spiralMatrix{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the No of Rows & Columns:");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];
        
        System.out.println("Enter the Elements :");
        for(int i = 0; i < rows; i++){
            for(int j =0; j < cols;j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.print("Do you want to print simple matrix or Spiral Matrix :\nPress 0 for simple \nPress 1 for Spiral Matrix\n");
        int printType = sc.nextInt();
        if(printType == 0){
            simplePrintMatrix(matrix);
        } else if(printType == 1){
            printSpiralMatrix(matrix);
        } else {
            System.out.println("Invalid Entry.");
        }
        

        
        
    }
    static void simplePrintMatrix(int[][] matrix){
        for(int[] rowArray : matrix){
            for(int element : rowArray){
                System.out.print(element+" ");
            }
            System.out.println();
        }
    }
    static void printSpiralMatrix(int[][] matrix){
        int rowS = 0, rowEnd = matrix.length -1, colS =0, colEnd = matrix[0].length -1, index;

        while(rowS <= rowEnd && colS <= colEnd){
            for(index = colS; index <= colEnd ; index++ ){
                System.out.print(matrix[rowS][index]+" ");
            }
            rowS++;
            for(index = rowS; index <= rowEnd; index++){
                System.out.print(matrix[index][colEnd]+" ");

            }
            colEnd--;
            if(rowS <= rowEnd){
                for(index = colEnd; index >= colS ; index-- ){
                System.out.print(matrix[rowEnd][index]+" ");
                }   
            }
            rowEnd--;
            if(colS <= colEnd){
                for(index = rowEnd; index >= rowS; index--){
                    System.out.print(matrix[index][colS]+" ");

                }
            }
            colS++;
        }
    }

}