import java.util.Arrays;

public class sort {


		
		public static void main(String[] args) {
			
			int[] d = {43,42,32,38,30,37, 3, 47,17,10};
			System.out.println(Arrays.toString(d));
			insertion s = new insertion(d);
			s.insertionSort();

		}

	

}
