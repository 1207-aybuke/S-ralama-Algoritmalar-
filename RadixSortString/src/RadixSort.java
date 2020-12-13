import java.util.Arrays;

public class RadixSort {

	public static void main (String[] args) { 
	    String[] arr = {"bilgisayar", "muhendisligi", "yazilim","donanim", "java","veri","yapilari","algoritma","siralamalar"}; 
	    radixSort(arr,'a','z'); 
	    for(int i=0;i<arr.length;i++){ 
	      System.out.println(arr[i]); 
	    } 
	  }
	 
	 public static void countSort(String[] arr,int index,char dusuk_karakter,char yuksek_karakter){ 
		    int[] countArray = new int[(yuksek_karakter-dusuk_karakter)+2]; 
		    String[] tempArray = new String[arr.length]; 
		    Arrays.fill(countArray,0); 
		     
		   
		    for(int i=0;i<arr.length;i++){ 
		      int charIndex = (arr[i].length()-1 < index) ? 0 : ((arr[i].charAt(index) - dusuk_karakter)+1); 
		      countArray[charIndex]++; 
		    } 
		     
		    
		    for(int i=1;i<countArray.length;i++){ 
		      countArray[i] += countArray[i-1]; 
		    } 
		     
		    for(int i=arr.length-1;i>=0;i--){ 
		      int charIndex = (arr[i].length()-1 < index) ? 0 : (arr[i].charAt(index) - dusuk_karakter)+1; 
		      tempArray[countArray[charIndex]-1] = arr[i]; 
		      countArray[charIndex]--; 
		    } 
		     
		    for(int i=0;i<tempArray.length;i++){ 
		      arr[i] = tempArray[i];    
		    } 
		  } 
		   
		  public static void radixSort(String[] arr,char dusuk_karakter,char yuksek_karakter){ 
		    int maxIndex = 0; 
		    for(int i=0;i<arr.length;i++){ 
		      if(arr[i].length()-1 > maxIndex){ 
		        maxIndex = arr[i].length()-1; 
		      } 
		    } 
		     
		    for(int i=maxIndex;i>=0;i--){ 
		      countSort(arr,i,dusuk_karakter,yuksek_karakter); 
		    } 
		  } 	
}