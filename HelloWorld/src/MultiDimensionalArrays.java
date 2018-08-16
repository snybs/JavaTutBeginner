
public class MultiDimensionalArrays {

	public static void main(String[] args) {

		int[][] matrix = {
				{3,45,67},{345,6767,78899},{24,46,67,78,89}
		};
		
		int value = matrix[0][1];
		
		//below should print 45
		//System.out.println(value);
		
		String[][] sentences = new String[2][3];
		
		sentences[0][1] = "Ich liebe das bandyspiel";
		
		//System.out.println(sentences[0][1]);
		
		for(int row = 0;row < matrix.length;row++){
			for(int col = 0; col < matrix[row].length;col++){
				System.out.print(matrix[row][col] + " ");
			}
			System.out.println();
		}
		
	}

}
