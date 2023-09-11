public class Successors {
    public static Position findPosition(int input, int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (input == arr[i][j]) {
                    Position inputPos = new Position(i, j);
                    return inputPos;
                }
            }
        }
        return null;
    }

    public static Position[][] getSuccessorArray(int[][] arr) {
        Position[][] arrRes = new Position[arr.length][arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int temp = arr[i][j] + 1;
                for (int m = 0; m < arr.length; m++) {
                    for (int n = 0; n < arr[m].length; n++) {
                        if (arr[m][n] == temp) {
                            arrRes[i][j] = new Position(m, n);
                        }
                    }
                }
            }
        }
        return arrRes;
    }
}