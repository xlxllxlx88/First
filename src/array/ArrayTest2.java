package array;

public class ArrayTest2 {

	public static void main(String[] args) {
		double[] data = new double[5];
		
		data[0] = 10.0;
		data[2] = 20.0;
		data[4] = 40.0;
		
		for(int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}

	}

}
