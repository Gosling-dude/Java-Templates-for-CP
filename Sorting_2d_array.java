import java.util.Arrays;

public class Sorting_2d_array{
    public static void main(String[] args) {
        int[][] Sumit_ki_matrix = {
            {1, 2, 3},
            {4, 0, 6},
            {7, 8, 9}
        };

        // Sort Sumit_ki_matrix based on the second column (index 1)
        Arrays.sort(Sumit_ki_matrix, (a, b) -> Integer.compare(a[1], b[1]));

        // Display sorted Sumit_ki_matrix
        System.out.println("Sorted Sumit_ki_matrix: (ascending order based on second column)");
        for (int[] row : Sumit_ki_matrix) {
            System.out.println(Arrays.toString(row));
        }

         Arrays.sort(Sumit_ki_matrix, (a, b) -> Integer.compare(b[1], a[1]));

        System.out.println("Sorted in descending order (by column 1):");
        for (int[] row : Sumit_ki_matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}
