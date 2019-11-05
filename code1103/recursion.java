public class recursion{
	public static void printNumber(int n){
		if(n<10){
			System.out.printf("%d",n);
		}else{
			int m=n/10;
			printNumber(m);
			int i=n%10;
			System.out.printf("%d",i);
		}
	}
	public static int numSum(int n){
		if(n<10){
			return n;
		}else{
			int i=n/10;
			int h=numSum(i);
			int o=n%10;
			int sum=h+o;
			return sum;
		}
		
	}
	public static void hanoi(int n,int from,int to){
		if(n==1){
			System.out.printf("从%d移动到%d%n",from,to);
		}else{
			int other=3-from-to;
			hanoi(n-1,from,other);
			System.out.printf("从%d移动到%d%n",from,to);
			hanoi(n-1,other,to);
		}
	}
	public static int jump(int n){
		if(n==1||n==2){
			System.out.printf("一共有%d种跳法",n);
			return n;
		}else{
			int ret=(n-1)+(n-2);
			System.out.printf("一共有%d种跳法",ret);
			return ret;
		}
	}
	public static void main(String[] args){
		// printNumber(2333);
		// System.out.println(numSum(2333));
		//hanoi(4,0,2);
		jump(5);
		
	}
}

