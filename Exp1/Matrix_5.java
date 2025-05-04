import java.util.Scanner;

public class Matrix_5 {

    // addition
    public static void add(int[][] a1, int[][] a2) {
        System.out.println("Sum of array:");
        for (int i = 0; i < 2; i++) {
            System.out.println(" ");
            for (int j = 0; j < 2; j++) {
                int r = a1[i][j] + a2[i][j];
                System.out.print(r+ " ");
            }
        }
    }

    // subtraction
    public static void sub(int[][] a1, int[][] a2) {
        System.out.println("Subtraction of array:"  );
        for (int i = 0; i < 2; i++) {
            System.out.println(" ");
            for (int j = 0; j < 2; j++) {
                int r = a1[i][j] - a2[i][j];
                System.out.print(r + " ");
            }
        }
    }

    // multiplication
    public static void mul(int[][] a1, int[][] a2) {
        int[][] r3 = new int[2][2];
        System.out.println("Multiplication of array:" );
        for (int i = 0; i < 2; i++) {
            System.out.println(" ");
            for (int j = 0; j < 2; j++) {
                // int[][] result2 = new int[i][j];
                for (int k = 0; k < 2; k++) {

                    r3[i][j] = 0;
                    r3[i][j] += a1[i][k] * a2[k][j];
                }

                System.out.print(r3[i][j] + " ");
            }
        }
    }

    // transpose of arr1
    public static void transpose1(int[][] a1) {
        System.out.println("Transpose of array1:" );
        for (int i = 0; i < 2; i++) {
            System.out.println(" ");
            for (int j = 0; j < 2; j++) {
                int r = a1[j][i];
                System.out.print( r + " ");
            }
        }
    }

    // transpose of arr2
    public static void transpose2(int[][] a2) {
        
        System.out.println("Transpose of array1:" );
        for (int i = 0; i < 2; i++) {
            System.out.println(" ");
            for (int j = 0; j < 2; j++) {
                int r = a2[j][i];
                System.out.print(r + " ");
            }
        }
    }

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int[][] a1 = new int[2][2];
        int[][] a2 = new int[2][2];

        System.out.println("Enter array1 elements: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                a1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter array2 elements: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                a2[i][j] = sc.nextInt();
            }
        }

        System.out.println("Choose an operation: 1-Addition, 2-Subtraction, 3-Multiplication, 4-Transpose");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Addition of two matrix:");
                add(a1, a2);
                break;

            case 2:
                System.out.println("\nSubtraction of two matrix:");
                sub(a1, a2);
                break;

            case 3:
                System.out.println("\nMultiplication of two matrix:");
                mul(a1, a2);
                break;

            case 4:
                System.out.println("\nTranspose of two matrix:");
                transpose1(a1);
                break;

                case 5:
                System.out.println("\nTranspose of two matrix:");
                transpose2(a2);
                break;

            default:
                break;
        }

    }
}

/*
 * import java.util.Scanner;
 * 
 * public class Matrix_5 {
 * public static void main(String[] args) {
 * Scanner scanner = new Scanner(System.in);
 * int[][] matrix1 = new int[2][2];
 * int[][] matrix2 = new int[2][2];
 * int[][] result = new int[2][2];
 * 
 * System.out.println("Enter elements of first 2x2 matrix:");
 * for (int i = 0; i < 2; i++) {
 * for (int j = 0; j < 2; j++) {
 * matrix1[i][j] = scanner.nextInt();
 * }
 * }
 * 
 * System.out.println("Enter elements of second 2x2 matrix:");
 * for (int i = 0; i < 2; i++) {
 * for (int j = 0; j < 2; j++) {
 * matrix2[i][j] = scanner.nextInt();
 * }
 * }
 * 
 * System.out.
 * println("Choose an operation: 1-Addition, 2-Subtraction, 3-Multiplication, 4-Transpose"
 * );
 * int choice = scanner.nextInt();
 * 
 * switch (choice) {
 * case 1:
 * for (int i = 0; i < 2; i++) {
 * for (int j = 0; j < 2; j++) {
 * result[i][j] = matrix1[i][j] + matrix2[i][j];
 * }
 * }
 * break;
 * 
 * case 2:
 * for (int i = 0; i < 2; i++) {
 * for (int j = 0; j < 2; j++) {
 * result[i][j] = matrix1[i][j] - matrix2[i][j];
 * }
 * }
 * break;
 * 
 * case 3:
 * for (int i = 0; i < 2; i++) {
 * for (int j = 0; j < 2; j++) {
 * result[i][j] = 0;
 * for (int k = 0; k < 2; k++) {
 * result[i][j] += matrix1[i][k] * matrix2[k][j];
 * }
 * }
 * }
 * break;
 * 
 * case 4:
 * System.out.println("Transpose of first matrix:");
 * for (int i = 0; i < 2; i++) {
 * for (int j = 0; j < 2; j++) {
 * System.out.print(matrix1[j][i] + " ");
 * }
 * System.out.println();
 * }
 * 
 * System.out.println("Transpose of second matrix:");
 * for (int i = 0; i < 2; i++) {
 * for (int j = 0; j < 2; j++) {
 * System.out.print(matrix2[j][i] + " ");
 * }
 * System.out.println();
 * }
 * //return 0;
 * 
 * default:
 * System.out.println("Invalid choice");
 * //return;
 * }
 * 
 * System.out.println("Resultant Matrix:");
 * for (int i = 0; i < 2; i++) {
 * for (int j = 0; j < 2; j++) {
 * System.out.print(result[i][j] + " ");
 * }
 * System.out.println();
 * }
 * 
 * scanner.close();
 * }
 * }
 */
