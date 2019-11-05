public class Array{
	public static int max(int []a){
		int max=0;
		int i=a.length;
		for(int j=0;j<i;j++){
			if(max<a[j]){
				max=a[j];
			}
		}
		return max;
	}
	public static double average(int []a){
		 double i=a.length;
		 double sum=0;
		for(int j=0;j<i;j++){
			sum+=a[j];
		}
		return sum/i;
	}
	public static int indexOf(int []a,int n){
		int i=0;
		while(true){
			if(i==a.length){
				return -1;
			}
			if(n==a[i]){
				return i;
			}
			i++;
		}
	}public static int lastIndexOf(int []a,int n){
		int i=a.length-1;
		while(true){
			if(i<0){
				return -1;
			}
			if(n==a[i]){
				return i;
			}
			i--;
		}
	}
	public static void main(String[] args){
		int []a={2,4,12,42,134,123,45,12,25};
		int n=1;
		System.out.println("最大值为:"+max(a));
		System.out.println("平均值为:"+average(a));
		System.out.println("第一个相同值下标为:"+indexOf(a,n));
		System.out.println("最后一个相同值下标为:"+lastIndexOf(a,n));
	}
}