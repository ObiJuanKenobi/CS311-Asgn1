package hw4;

import java.util.List;

public class MeasureTimeComplexity implements IMeasureTimeComplexity {

	@Override
	public int normalize(IMeasurable m, long timeInMilliseconds) {
		int iterations = 0;
		long overallTime = 0;
		while (overallTime >= timeInMilliseconds){
		
			long startTime = System.currentTimeMillis();
			
			for(int i = iterations; i > 0; i--){
					
			m.execute();
		}			
			long endTime = System.currentTimeMillis();
			
			iterations++;
			overallTime = endTime - startTime;
	}
		
		
		return iterations;
	}

	@Override
	public List<? extends IResult> measure(IMeasureFactory factory, int nmeasures, int startsize, int endsize,
			int stepsize) {
		// TODO Auto-generated method stub
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
