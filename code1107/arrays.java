import java.util.Arrays;
public class arrays{
	public static void swap(int[] a,int[] b){
		int[] t=a;
		a = b;
		b = t;
		
	}
    //原地排序
	public static void bubbleSort(int[] a){
		for(int i=0;i<a.length-1;i++){
			//需要冒泡的次数
			for(int j=0;j<a.length-1-i;j++){
				//冒泡的范围
				if(a[j]>a[j+1]){
					int t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		}
		
	} 
	public static void bubbleSort2(int[] a){
		for(int i=0;i<a.length-1;i++){
			//需要冒泡的次数
			for(int j=1;j<a.length-1-i;j++){
				//冒泡的范围
				if(a[j-1]>a[j]){
					int t=a[j];
					a[j]=a[j-1];
					a[j-1]=t;
				}
			}
		}
		
	} 
	
		//二分查找
	public static int binarySearch2(int[]a,int v){
			int left=0;
			int right=a.length-1;
			while(left<=right){
				int mid =(left+right)/2;
				if(v==a[mid]){
					return mid;
				}else if(v<a[mid]){
					right=mid-1;
				}else{
					left=mid+1;
				}
			}
			return -1;
	}
	//数组复制
	public static int[] copyOf(int[] a,int newLength){
		
	}
	public static void main(String[] args){
		int[] ar1={2,35,6,78,3};
		int[] ar2={45,6,23,1,76};
		int[] ar3={45,24,23,1,76};
		int[] ar4={2,3,5,7,9};
		int n=5;
		//swap(ar1,ar2);
		// bubbleSort(ar1);
		// bubbleSort2(ar2);
		binarySearch2(ar4,n);
		if (binarySearch2(ar4,n)==-1){
			System.out.println("没找到");
		}else{
			System.out.println(binarySearch2(ar4,n));
		}
		// System.out.println(Arrays.toString(ar1));
		// System.out.println(Arrays.toString(ar2));
		
		
	}
}
