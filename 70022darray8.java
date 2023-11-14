// Program to find the frequency of odd & even numbers in the given matrix.

class Main {

    // declaring variables
    private static int rows, cols, even, odd;
    // declaring matrix or 2d array.
    private static int matrix[][];

    // function to print matrix elements.
    public static void printMatrix() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] % 2 == 0)
                    even++;
                else
                    odd++;
            }
        }
    }

    // Main function
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        rows = sc.nextInt();
        System.out.print("Enter the number of columns : ");
        cols = sc.nextInt();

        matrix = new int[rows][cols];

        // getting matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element at " + (i + 1) + (j + 1) + ' ');
                matrix[i][j] = sc.nextInt();
            }
        }
        printMatrix();
        System.out.println("Frequency of odd numbers : " + odd + "\nFrequency of even numbers : " + even);
    }
}