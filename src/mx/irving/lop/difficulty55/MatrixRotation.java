package mx.irving.lop.difficulty55;

/**
 * Created by Irving Lop on 15/12/2015.
 * Problem Statement

 You are given a 2D matrix, a, of dimension MxN and a positive integer R. You have to rotate the matrix R times and
 print the resultant matrix. Rotation should be in anti-clockwise direction.

 Rotation of a 4x5 matrix is represented by the following figure. Note that in one rotation, you have to shift elements
 by one step only (refer sample tests for more clarity).

 matrix-rotation

 It is guaranteed that the minimum of M and N will be even.

 Input
 First line contains three space separated integers, M, N and R, where M is the number of rows, N is number of columns
 in matrix, and R is the number of times the matrix has to be rotated.
 Then M lines follow, where each line contains N space separated positive integers. These M lines represent the matrix.

 Output
 Print the rotated matrix.

 Constraints
 2 <= M, N <= 300
 1 <= R <= 109
 min(M, N) % 2 == 0
 1 <= aij <= 108, where i ∈ [1..M] & j ∈ [1..N]
 */
public class MatrixRotation {

    private String [][] matrixInput;
    private String [][] matrixPivot;

    public MatrixRotation(int rows, int columns) {
        matrixInput = new String[rows][columns];
    }

    public void fillRow(int row, String line) {
        matrixInput [row] = line.split(" ");
    }

    private void generateMatrixPivot() {

    }
}