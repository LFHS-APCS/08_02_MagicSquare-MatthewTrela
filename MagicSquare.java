
/**
 * @author 
 * @version 
 */

public class MagicSquare
{
    /** The magic square array data */
    private int[][] array;

    /**
     * Constructs a MagicSquare object.
     * @param input the magic square array data.
     */
    public MagicSquare(int[][] input)
    {
        array = input;
    }

    /**
     * Tests to see if array is indeed a magic square
     * @return true if array is a magic square
     * @return false if the array is not a magic square
     */
    public boolean isMagicSquare()
    {
      if (!isSquare()) {
        return false;
      }
      int mNum = getMagicNum();
      int total = 0;
      for (int i = 0; i < array.length; i++) {
        for (int j = 0; j < array[i].length; j++) {
          total += array[i][j];
        }
        if (total != mNum) {
          return false;
        }
        total = 0;
      }
      for (int n = 0; n < array.length; n++) {
        for (int m = 0; m < array.length; m++) {
          total += array[m][n];
        }
        if (total != mNum) {
          return false;
        }
        total = 0;
      }
      for (int p = 0; p < array.length; p++) {
        total += array[p][p];
      }
      if (total != mNum) {
        return false;
      }
      total = 0;
      for (int v = 0; v < array.length; v++) {
        total += array[v][array.length - 1 - v];
      }
      if (total != mNum) {
        return false;
      }
      total = 0;
        return true;   // complete this method
    }

    private int getMagicNum() {
      int magicNum = 0;
      for (int i = 0; i < array.length; i++) {
        magicNum += array[0][i];
      }
      return magicNum;
    }

    private boolean isSquare() {
      int height = array.length;
      for (int s = 0; s < array.length; s++) {
        if (array[s].length != height) {
          return false;
        }
      }
      return true;
    }
    /**
     * Returns a String which represents the array.
     */
    public String toString()
    {
        String result = "";
        for(int r = 0; r < array.length; r++)
        {
            for(int c = 0; c <array[r].length; c++)
            {
                result += array[r][c];
                result += "\t";
            }
            result += "\n";
        }
        return result;
    }
}
