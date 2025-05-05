public class Board {
  private static final int SIZE = 9;
  private Cell[][] board;

  public Board() {
    this.board = new Cell[SIZE][SIZE];
    initializeBoard();
  }

  public Board(String initialValues) {
    this.board = new Cell[SIZE][SIZE];
    initializeBoard(initialValues);
  }

  private void initializeBoard() {
    for (int i = 0; i < SIZE; i++) {
      for (int j = 0; j < SIZE; j++) {
        board[i][j] = new Cell(0, false);
      }
    }
  }

  private void initializeBoard(String initialValues) {
    initializeBoard();

    String[] cellsData = initialValues.split(" ");

    for (String cellData : cellsData) {
      try {
        String[] parts = cellData.split(";");
        String[] coordinates = parts[0].split(",");

        int row = Integer.parseInt(coordinates[0]);
        int col = Integer.parseInt(coordinates[1]);

        String[] cellProperties = parts[1].split(",");
        int value = Integer.parseInt(cellProperties[0]);
        boolean isFixed = Boolean.parseBoolean(cellProperties[1]);

        if (row >= 0 && row < SIZE && col >= 0 && col < SIZE) {
          board[row][col] = new Cell(value, isFixed);
        }
      } catch (Exception e) {
        System.err.println("Error parsing cell data: " + cellData + " - " + e.getMessage());
      }
    }
  }

  public void displayBoard() {
    System.out.println("  0 1 2 | 3 4 5 | 6 7 8 ");
    System.out.println("-------------------------");
    for (int i = 0; i < SIZE; i++) {
      System.out.print(i + " ");
      for (int j = 0; j < SIZE; j++) {
        System.out.print(board[i][j] + " ");
        if ((j + 1) % 3 == 0 && j < 8) {
          System.out.print("| ");
        }
      }
      System.out.println();
      if ((i + 1) % 3 == 0 && i < 8) {
        System.out.println("-------------------------");
      }
    }
    System.out.println();
  }

  public boolean isSafe(int row, int col, int num) {
    for (int c = 0; c < SIZE; c++) {
      if (board[row][c].getValue() == num) {
        return false;
      }
    }

    for (int r = 0; r < SIZE; r++) {
      if (board[r][col].getValue() == num) {
        return false;
      }
    }

    int boxRowStart = row - row % 3;
    int boxColStart = col - col % 3;

    for (int r = boxRowStart; r < boxRowStart + 3; r++) {
      for (int c = boxColStart; c < boxColStart + 3; c++) {
        if (board[r][c].getValue() == num) {
          return false;
        }
      }
    }

    return true;
  }

  public boolean isFull() {
    for (int i = 0; i < SIZE; i++) {
      for (int j = 0; j < SIZE; j++) {
        if (board[i][j].getValue() == 0) {
          return false;
        }
      }
    }
    return true;
  }

  public Cell getCell(int row, int col) {
    return board[row][col];
  }
}
