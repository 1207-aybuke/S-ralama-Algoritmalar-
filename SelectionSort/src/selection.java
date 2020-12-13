import java.util.Arrays;

public class selection {

	int[] dizi;
	
	public selection(int[] dizi) {
		this.dizi=dizi;
	}
	
	public void selectionSort() {
		int minIndex=0;
		int tmp=0;
		for(int i=0; i<dizi.length; i++) {
			minIndex = i;
			for(int j=i+1; j<dizi.length; j++) {
				if(dizi[j]<dizi[minIndex]) {
					minIndex = j;
				}
			}
			tmp=dizi[minIndex];
			dizi[minIndex] = dizi[i];
			dizi[i] = tmp;
			
			System.out.println(Arrays.toString(this.dizi));
		}
	}
	
	
}
