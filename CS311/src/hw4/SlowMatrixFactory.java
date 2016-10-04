package hw4;

import java.util.Random;

public class SlowMatrixFactory implements IMeasureFactory {

	@Override
	public IMeasurable createRandom(int size) {
		int[][] ranMatrix =  new int [size][size];
		Random rnd = new Random();
		
		for(int i = 0; i < size; i++){
			
			for (int j = 0; j < size; j++){
				ranMatrix[i][j] = rnd.nextInt();
			}
		}
		return ranMatrix;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
