import java.util.Arrays;
public class practices{
	public static void bubbleSort(int[] a){
		for(int i=0;i<a.length-1;i++){
			//需要冒泡的次数
			for(int j=a.length-1;j>i;j--){
				//冒泡的范围
				if(a[j]>a[j-1]){
					int t=a[j];
					a[j]=a[j-1];
					a[j-1]=t;
				}
			}
		}
		
	} 
	
	public static void main(String[] args){
		int[] ar={23,546,24,7,87};
		bubbleSort(ar);
		System.out.println(Arrays.toString(ar));
	}

}