public class PascalsTriangle {
  public static int[][] pascal(int depth) {
    int[][] p = new int[depth][];
    p[0] = new int[]{1};
    for(int i = 1; i < depth; i++){
      p[i] = new int[i + 1];

      p[i][0] = 1;
      p[i][i] = 1;

      for(int j = 1; j < i; j++){
          p[i][j] = p[i - 1][j - 1] + p[i - 1][j];
      }
    }
    return p;
  }
}
