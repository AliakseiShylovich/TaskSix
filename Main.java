public class Main {
    public static void main(String[] args) {
        int[][] matrixOne = new int[4][4];
        int[][] matrixTwo = new int[4][4];
        int[][] matrixSum = new int[4][4];
        int[][] matrixDif = new int[4][4];
        if (matrixOne.length != matrixTwo.length) {
            System.out.println("Матрици имеют разные размеры");
        } else {
            System.out.println("MatrixOne");
            for (int i = 0; i < matrixOne.length; i++) {
                for (int j = 0; j < matrixOne[i].length; j++) {
                    matrixOne[i][j] = (int) (Math.random() * 10);
                    System.out.print(matrixOne[i][j] + "  ");
                }
                System.out.println();
            }
            System.out.println("MatrixTwo");
            for (int i = 0; i < matrixTwo.length; i++) {
                for (int j = 0; j < matrixTwo[i].length; j++) {
                    matrixTwo[i][j] = (int) (Math.random() * 10);
                    System.out.print(matrixTwo[i][j] + "  ");
                }
                System.out.println();
            }
            System.out.println("MatrixSum");
            for (int i = 0; i < matrixOne.length; i++) {
                for (int j = 0; j < matrixOne[i].length; j++) {
                    matrixSum[i][j] = matrixOne[i][j] + matrixTwo[i][j];
                    System.out.print(matrixSum[i][j] + "  ");
                }
                System.out.println();
            }
            System.out.println("MatrixDif");
            for (int i = 0; i < matrixOne.length; i++) {
                for (int j = 0; j < matrixOne[i].length; j++) {
                    matrixDif[i][j] = matrixOne[i][j] - matrixTwo[i][j];
                    System.out.print(matrixDif[i][j] + "  ");
                }
                System.out.println();
            }
        }
    }
}