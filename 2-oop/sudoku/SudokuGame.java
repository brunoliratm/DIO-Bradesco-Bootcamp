import java.util.Scanner;

public class SudokuGame {
    private Board board;
    private Scanner scanner;

    public SudokuGame(String initialValues) {
        this.board = new Board(initialValues);
        this.scanner = new Scanner(System.in);
    }

    public void play() {
        System.out.println("Bem-vindo ao Sudoku!");
        board.displayBoard();

        while (!board.isFull()) {
            System.out.println("Digite a linha (0-8), coluna (0-8) e valor (1-9) separados por espaço (ou 'sair' para encerrar):");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("sair")) {
                break;
            }

            String[] parts = input.split(" ");
            if (parts.length == 3) {
                try {
                    int row = Integer.parseInt(parts[0]);
                    int col = Integer.parseInt(parts[1]);
                    int value = Integer.parseInt(parts[2]);

                    if (row >= 0 && row < 9 && col >= 0 && col < 9 && value >= 1 && value <= 9) {
                        Cell cell = board.getCell(row, col);
                        if (!cell.isFixed()) {
                            if (board.isSafe(row, col, value)) {
                                cell.setValue(value);
                                board.displayBoard();
                                if (board.isFull()) {
                                    System.out.println("Parabéns! Você completou o Sudoku!");
                                    break;
                                }
                            } else {
                                System.out.println("Valor inválido para esta célula.");
                            }
                        } else {
                            System.out.println("Esta célula é fixa e não pode ser alterada.");
                        }
                    } else {
                        System.out.println("Entrada inválida. Digite linha, coluna e valor entre 0-8 e 1-9.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Entrada inválida. Certifique-se de digitar números.");
                }
            } else {
                System.out.println("Entrada inválida. Digite no formato: linha coluna valor.");
            }
        }

        if (!board.isFull() && !scanner.hasNextLine()) {
            System.out.println("Jogo encerrado.");
        }
        scanner.close();
    }
}
