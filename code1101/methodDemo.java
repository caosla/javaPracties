public class methodDemo{
	//这里定义方法
	//public class 返回值类型  方法名称(参数类型 参数名称){}
	/*public static double sub(double a,double b){
		return a-b;
	}*/
	public static int fac(int n){
		int fac=1;
		for(int i=1;i<=n;i++){
			fac*=i;
		}
		return fac;
	}
	public static int sum(int n){
		int sum=0;
		for(int i=1;i<=n;i++){
			sum+=fac(i);
		}
		return sum;
	}
	public static void main(String[] args){
		/* double a=10;
		 double b=5;
		 double c=sub(a,b);
		 System.out.println(c);*/
		 int n=Integer.parseInt(args[0]);
		 n=sum(n);
		 System.out.println(n);
		 
	}
}