import java.util.Arrays;

public class bubble {
	
	int[] dizi;
	
	public bubble(int[] dizi) {
		this.dizi=dizi;
	}
	
	public void bubbleSort() {
		
		int tmp=0;
		boolean degisim = true;
		for(int i=0; i<dizi.length && degisim; i++) {
			degisim= false;
			for(int j=0; j<dizi.length-1-i; j++) {
				
				if(this.dizi[j]>dizi[j+1]) {
					tmp = dizi[j];
					dizi[j] = dizi[j+1];
					dizi[j+1] = tmp;
					degisim = true;
					
				}
			}
			System.out.println(Arrays.toString(this.dizi));
		}
		
	}
	
}
