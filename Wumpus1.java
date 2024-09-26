import java.util.Scanner;

public class Wumpus1 {
    private char[][] grid;
    private int playerX, playerY;
    private boolean wumpusAlive;

    public Wumpus1() {
        grid = new char[4][4];
        wumpusAlive = true;
        initializeGrid();
        placeObjects();
    }

    private void initializeGrid() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                grid[i][j] = '-';
            }
        }
    }

    private void placeObjects() {
        // Place player
        playerX = 0;
        playerY = 0;
        grid[playerX][playerY] = 'P';

        // Place wumpus
        int wumpusX = (int) (Math.random() * 4);
        int wumpusY = (int) (Math.random() * 4);
        while (wumpusX == playerX && wumpusY == playerY) {
            wumpusX = (int) (Math.random() * 4);
            wumpusY = (int) (Math.random() * 4);
        }
        grid[wumpusX][wumpusY] = 'W';

        // Place gold
        int goldX = (int) (Math.random() * 4);
        int goldY = (int) (Math.random() * 4);
        while ((goldX == playerX && goldY == playerY) || (goldX == wumpusX && goldY == wumpusY)) {
            goldX = (int) (Math.random() * 4);
            goldY = (int) (Math.random() * 4);
        }
        grid[goldX][goldY] = 'G';

        // Place pits
        for (int i = 0; i < 3; i++) {
            int pitX = (int) (Math.random() * 4);
            int pitY = (int) (Math.random() * 4);
            while ((pitX == playerX && pitY == playerY) || (pitX == wumpusX && pitY == wumpusY)
                    || (pitX == goldX && pitY == goldY)) {
                pitX = (int) (Math.random() * 4);
                pitY = (int) (Math.random() * 4);
            }
            grid[pitX][pitY] = 'P';
        }
    }

    public void printGrid() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void movePlayer(String direction) {
        int newX = playerX;
        int newY = playerY;

        switch (direction) {
            case "up":
                newX--;
                break;
            case "down":
                newX++;
                break;
            case "left":
                newY--;
                break;
            case "right":
                newY++;
                break;
        }

        if (newX >= 0 && newX < 4 && newY >= 0 && newY < 4) {
            grid[playerX][playerY] = '-';
            playerX = newX;
            playerY = newY;
            grid[playerX][playerY] = 'P';
        } else {
            System.out.println("Invalid move!");
        }
    }

    public void checkCurrentPosition() {
        if (grid[playerX][playerY] == 'W') {
            if (wumpusAlive) {
                System.out.println("You've been eaten by the Wumpus! Game Over!");
                System.exit(0);
            } else {
                System.out.println("You smell something awful but the Wumpus is already dead.");
            }
        } else if (grid[playerX][playerY] == 'P') {
            System.out.println("You fell into a pit! Game Over!");
            System.exit(0);
        } else if (grid[playerX][playerY] == 'G') {
            System.out.println("Congratulations! You found the gold and won the game!");
            System.exit(0);
        } else {
            System.out.println("Nothing here.");
        }
    }

    public void shootArrow(String direction) {
        if (direction.equals("up") && playerX > 0 && grid[playerX - 1][playerY] == 'W') {
            System.out.println("You killed the Wumpus!");
            wumpusAlive = false;
        } else if (direction.equals("down") && playerX < 3 && grid[playerX + 1][playerY] == 'W') {
            System.out.println("You killed the Wumpus!");
            wumpusAlive = false;
        } else if (direction.equals("left") && playerY > 0 && grid[playerX][playerY - 1] == 'W') {
            System.out.println("You killed the Wumpus!");
            wumpusAlive = false;
        } else if (direction.equals("right") && playerY < 3 && grid[playerX][playerY + 1] == 'W') {
            System.out.println("You killed the Wumpus!");
            wumpusAlive = false;
        } else {
            System.out.println("You missed!");
        }
    }

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        Wumpus1 game = new Wumpus1();

        System.out.println("Welcome to Wumpus World!");
        while (true) {
            System.out.println("Current grid:");
            game.printGrid();
            System.out.print("Enter your move (up, down, left, right): ");
            String move = scanner.next();
            game.movePlayer(move);

            System.out.println("Checking current position...");
            game.checkCurrentPosition();

            System.out.print("Shoot arrow? (yes/no): ");
            String shoot = scanner.next();
            if (shoot.equals("yes")) {
                System.out.print("Enter direction to shoot (up, down, left, right): ");
                String direction = scanner.next();
                game.shootArrow(direction);
            }
        }
    }
}
