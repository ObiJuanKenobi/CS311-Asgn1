package hw4;

public class SlowMatrix implements IMatrix, IMeasurable {
	private int matrix[][];
	int row;
	int col;
	public static void main(String[] args) {
		

	}
	
	public SlowMatrix(int row, int column){
		this.row = row;
		col = column;
		matrix = new int[row][column];
	}
	
	
	@Override
	public void execute() {
		
		this.multiply(this);

	}

	@Override
	public IMatrix subMatrix(int upperLeftRow, int upperLeftCol, int lowerRightRow, int lowerRightCol)
			throws IllegalArgumentException {
		
		return null;
	}

	@Override
	public void setElement(int row, int col, Number val) throws IllegalArgumentException {
		matrix[row][col] = (int) val;

	}

	@Override
	public Number getElement(int row, int col) throws IllegalArgumentException {
		
		return matrix[row][col];
	}

	@Override
	public IMatrix multiply(IMatrix mat) throws IllegalArgumentException {
		SlowMatrix secondMatrix = (SlowMatrix)mat;
		SlowMatrix result = new SlowMatrix(row, secondMatrix.col);
		for(int i = 0; i < row; i++){
			
			for(int j = 0; j < secondMatrix.col; j++){
				
				for(int k = 0; k < col; k++){
				
				result.setElement(i, j, ((int)result.getElement(i, j) + (int)this.getElement(i, k) * (int)secondMatrix.getElement(k, k)));
				}
			}
		}
		return result;
	}

	@Override
	public IMatrix add(IMatrix mat) throws IllegalArgumentException {
		
		return null;
	}



}
