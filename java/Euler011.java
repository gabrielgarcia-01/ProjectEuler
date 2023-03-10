import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
//Given a 20x20 grid, find the four adjacent numbers in the same direction(up, down, left, right, diagonal)
//that give the largest product in the grid

class Euler11 {
	public static int maxProduct(int[][] grid, int n) {
		int max = 0;
		switch (n) {
			case 0:// horizontal
				for (int i = 0; i < grid.length - 3; i++) {
					for (int j = 0; j < grid[i].length - 3; j++) {
						int prod = grid[i][j] * grid[i][j + 1] * grid[i][j + 2] * grid[i][j + 3];
						if (prod > max)
							max = prod;
					}
				}
				break;
			case 1:// vertical
				for (int i = 0; i < grid.length; i++) {
					for (int j = 0; j < grid.length - 3; j++) {
						int prod = grid[j][i] * grid[j + 1][i] * grid[j + 2][i] * grid[j + 3][i];
						if (prod > max)
							max = prod;
					}
				}
				break;
			case 2:// diagonal
				for (int i = 0; i < grid.length - 3; i++) {// diagonal from top to bottom
					for (int j = 0; j < grid[i].length - 3; j++) {
						int prod = grid[i][j] * grid[i + 1][j + 1] * grid[i + 2][j + 2] * grid[i + 3][j + 3];
						if (prod > max)
							max = prod;
					}
				}
				for (int i = grid.length - 1; i > 3; i--) {// diagonal from bottom to top
					for (int j = 0; j < grid.length - 3; j++) {
						int prod = grid[i][j] * grid[i - 1][j + 1] * grid[i - 2][j + 2] * grid[i - 3][j + 3];
						if (prod > max)
							max = prod;
					}
				}
				break;

		}
		return max;
	}

	public static void printGrid(int[][] grid) {
		for (int i = 0; i < grid.length; i++) {
			System.out.println("");
			for (int j = 0; j < grid[i].length; j++) {
				System.out.printf("%4d", grid[i][j]);
			}
		}
	}

	public static void main(String[] args) {

		int[][] grid = new int[20][20];
		String line = "";
		long startTime = System.currentTimeMillis();

		int j = 0;
		try {// Reads Euler11.txt and makes it an array list
			BufferedReader reader = new BufferedReader(new FileReader("Euler011.txt"));
			while ((line = reader.readLine()) != null) {
				String[] split = line.split(" ");
				// Splits string into an array with " " as regex
				// 08 02 22 97 38 15 00 ==> {08,02,22,97,38,15,00}

				for (int i = 0; i < split.length; i++) {
					grid[j][i] = Integer.parseInt(split[i]);
				}
				j++;
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		int maxHorizontal = maxProduct(grid, 0);
		int maxVertical = maxProduct(grid, 1);
		int maxDiagonal = maxProduct(grid, 2);

		int max = Math.max(maxVertical, maxHorizontal);
		max = Math.max(max, maxDiagonal);
		long endTime = System.currentTimeMillis();
		double runTime = ((double) endTime - (double) startTime) / 1000.00;

		printGrid(grid);
		System.out.println("\nMax product of four adjacent numbers in the same direction: " + max);
		System.out.printf("Max horizontal: %d, Max vertical: %d, Max diagonal: %d", maxHorizontal, maxVertical,
				maxDiagonal);
		System.out.printf("Run time: %.2f\n", runTime);
	}
}
