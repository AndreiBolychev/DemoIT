import java.util.Scanner;

public class Homework4 {
    static char[][] board = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char currentPlayer = 'X';
        boolean gameEnded = false;

        while (!gameEnded) {
            printBoard();
            System.out.println("Игрок " + currentPlayer + ", выбери строку и колонку:");

            int row, col;
            while (true) {
                System.out.print("Строка: ");
                row = scanner.nextInt();
                System.out.print("Колонка: ");
                col = scanner.nextInt();
                row -= 1;
                col -= 1;

                if (row < 0 || row > 2 || col < 0 || col > 2) {
                    System.out.println("Неверный ввод.");
                } else if (board[row][col] != ' ') {
                    System.out.println("Клетка занята.");
                } else {
                    break;
                }
            }

            board[row][col] = currentPlayer;

            if (checkWin(currentPlayer)) {
                printBoard();
                System.out.println("Игрок " + currentPlayer + " победа");
                gameEnded = true;
            } else if (isBoardFull()) {
                printBoard();
                System.out.println("Ничья");
                gameEnded = true;
            } else {
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
            }
        }

        scanner.close();
    }

    public static void printBoard() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println("\n-------------");
        }
    }

    public static boolean checkWin(char player) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player &&
                    board[i][1] == player &&
                    board[i][2] == player) return true;

            if (board[0][i] == player &&
                    board[1][i] == player &&
                    board[2][i] == player) return true;
        }

        if (board[0][0] == player &&
                board[1][1] == player &&
                board[2][2] == player) return true;

        if (board[0][2] == player &&
                board[1][1] == player &&
                board[2][0] == player) return true;

        return false;
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (board[i][j] == ' ') return false;
        return true;
    }
}