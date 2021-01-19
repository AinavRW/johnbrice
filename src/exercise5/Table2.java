package exercise5;

public class Table2 {
	public static void main(String[] args) {
		int[][] table = new int[20][20];

		for (int row = 0; row < table.length; row++) {
			for (int col = 0; col < table.length; col++) {
				if (row == col || row + col == table.length - 1) {
					table[row][col] = 1;
				}

			}
		}
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[i].length; j++) {
				System.out.print(table[i][j] + " ");
				
			}
			System.out.println();
			
		}
	}
}
