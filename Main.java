package com.robert;


import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    }

    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> response = new LinkedList<>();

        int lineStop = matrix[0].length -1;
        int colStop  = matrix.length -1;
        int lineStart  = 0;
        int colStart = 0;

        while(colStart <= colStop && lineStart <= lineStop) {

            for (int i = lineStart; i <= lineStop; i++) {
                response.add(matrix[colStart][i]);
            }
            for (int i = colStart + 1; i <= colStop - 1; i++) {
                response.add(matrix[i][lineStop]);
            }
            if(colStart != colStop) {
                for (int i = lineStop; i >= lineStart; i--) {
                    response.add(matrix[colStop][i]);
                }
            }
            if(lineStart != lineStop) {
                for (int i = colStop - 1; i >= colStart + 1; i--) {
                    response.add(matrix[i][lineStart]);
                }
            }

            lineStop--;
            colStop--;
            lineStart++;
            colStart++;
        }

        return response;

    }


}