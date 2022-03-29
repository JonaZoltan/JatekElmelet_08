package jatekElmelet2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

public class jatekEBead2 {

    public static boolean nyeregPont(double matrix[][], int n) {

        for (int i = 0; i < n; i++) {
            double min_sor = matrix[i][0];
            int index = 0;

            for (int j = 0; j < n; j++) {
                if (min_sor > matrix[i][j]) {
                    min_sor = matrix[i][j];
                    index = j;
                }
            }

            int k;
            for (k = 0; k < n; k++) {
                if (min_sor < matrix[k][index]) {
                    break;
                }
            }
            if (k == n) {
                System.out.println("A nyeregpontja:" + min_sor);
                return true;
            }
        }
        System.out.println("Nem talált nyeregpontot!");
        return false;
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new BufferedReader(new FileReader("data.txt")));
        //int[][] matrix = {{4, 5, 6}, {7, 18, 9}, {5, 1, 3}};
        int row = 3, columns = 3;
        double[][] matrix = new double[row][columns];

        while (sc.hasNextLine()) {
            for (int i = 0; i < matrix.length; i++) {
                String[] line = sc.nextLine().trim().split(" ");
                for (int j = 0; j < line.length; j++) {
                    matrix[i][j] = Integer.parseInt(line[j]);
                }
            }
        }
        System.out.println("A Matrix:" + Arrays.deepToString(matrix));

        nyeregPont(matrix, row);
    }
}
