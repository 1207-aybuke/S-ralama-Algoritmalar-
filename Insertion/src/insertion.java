import java.util.Arrays;

public class insertion {

	int[] dizi;
	
	public insertion(int[] dizi) {
		this.dizi=dizi;
	}
	
	public void insertionSort(){
		int tmp=0;
		int j=0;
		for(int i=0; i<dizi.length; i++) {
			tmp=dizi[i];
				for(j=i-1; j>=0 && tmp<dizi[j]; j--) {
					dizi[j+1] = dizi[j];
				}	
				dizi[j+1] = tmp;
				
				System.out.println(Arrays.toString(this.dizi));
		}
		
	}
	
}
