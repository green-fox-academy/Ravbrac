package diagonal_matrix;

public class DiagonalMatrix {
    public static void main(String[] args) {
        // - Create (dynamically) a two dimensional array
        //   with the following matrix. Use a loop!
        //
        //   1 0 0 0
        //   0 1 0 0
        //   0 0 1 0
        //   0 0 0 1
        //
        // - Print this two dimensional array to the output

        int[][] twoDimensional = new int[4][4];

        for (int row = 0; row < twoDimensional.length; row++) {
            twoDimensional[row][row]++;
            for (int col = 0; col < twoDimensional[row].length; col++) {
                System.out.print(twoDimensional[row][col]);
            }
            System.out.println();
        }
    }
}
