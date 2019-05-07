/**
 * TicTacToe
 */
public class TicTacToe {

  static Character checkRows(String[] rows) {
    for (int i = 0; i < rows.length; i++) {
      String row = rows[i];

      if (row.equals("XXX")) {
        return 'X';
      }
      if (row.equals("OOO")) {
        return 'O';
      }
    }
    return null;
  }

  static Character checkCols(String[] rows) {
    String[] cols = { "", "", "" };

    for (int rowNum = 0; rowNum < 3; rowNum++) {
      char[] rowArr = rows[rowNum].toCharArray();

      for (int colNum = 0; colNum < 3; colNum++) {
        cols[colNum] = cols[colNum] + rowArr[colNum];
      }
    }

    for (int i = 0; i < cols.length; i++) {
      String col = cols[i];

      if (col.equals("XXX")) {
        return 'X';
      }
      if (col.equals("OOO")) {
        return 'O';
      }
    }
    return null;
  }

  static Character checkDiags(String[] rows) {
    String[] diags = { "", "", "" };
    boolean validX = false;
    boolean validO = false;
    boolean validX2 = false;
    boolean validO2 = false;

    for (int rowNum = 0; rowNum < 3; rowNum++) {
      char[] rowArr = rows[rowNum].toCharArray();

      for (int colNum = 0; colNum < 3; colNum++) {
        diags[colNum] = diags[colNum] + rowArr[colNum];
      }
    }

    for (int i = 0; i < diags.length; i++) {
      String diag = diags[i];

      if (i == 0) {
        if (diag.equals("--X")) {
          validX = true;
        } else if (diag.equals("X--")) {
          validX2 = true;
        } else if (diag.equals("--O")) {
          validO = true;
        } else if (diag.equals("O--")) {
          validO2 = true;
        }
      }

      if (i == 1) {
        if (validX == true || validX2 == true) {
          if (diag.equals("-X-")) {
            validX = true;
            validX2 = true;
          }
        }
        if (validO == true || validO2 == true) {
          if (diag.equals("-X-")) {
            validO = true;
            validO2 = true;
          }
        }
      }

      if (i == 2) {
        if (validX == true) {
          if (diag.equals("X--")) {
            return 'X';
          }
        }
        if (validX2 == true) {
          if (diag.equals("--X")) {
            return 'X';
          }
        }
        if (validO == true) {
          if (diag.equals("O--")) {
            return 'O';
          }
        }
        if (validO2 == true) {
          if (diag.equals("--O")) {
            return 'O';
          }
        }
      }
    }
    return null;
  }

  static String[] generateRows(String board) {
    String[] rows = { "", "", "" };
    char[] boardChars = board.toCharArray();

    for (int i = 0; i < boardChars.length; i++) {
      if (i >= 0 && i < 3) {
        rows[0] = rows[0] + boardChars[i];
      }
      if (i >= 3 && i < 6) {
        rows[1] = rows[1] + boardChars[i];
      }
      if (i >= 6 && i < 9) {
        rows[2] = rows[2] + boardChars[i];
      }
    }

    return rows;
  }

  static void print(String[] rows) {
    for (int i = 0; i < rows.length; i++) {
      System.out.println(rows[i]);
    }
  }

  static boolean checkWinner(String[] rows) {
    // check the rows
    Character winner = null;

    if (winner == null) {
      winner = checkRows(rows);
    }
    if (winner == null) {
      winner = checkCols(rows);
    }
    if (winner == null) {
      winner = checkDiags(rows);
    }

    System.out.println("Winner is " + winner);
    // check the columns

    // check the diagonals
    // if any of them have 3 pieces from the same player, that player won

    return true;
  }

  public static void main(String[] args) {
    String board = "--X-X-X--";
    // String board = "X---X---X";
    // String board = "XXX-X-X--"; // row
    // String board = "X--XX-X--"; // col
    String[] rows = generateRows(board);
    // print(rows);
    checkWinner(rows);
  }
}
