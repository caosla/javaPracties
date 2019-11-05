public class digui{
    public static long fac(int n){
	if(n==1){
		return 1;
	}else{
		return fac(n-1)*fac(n);
    	}
    }
     public static long fib(int n){
	if(n==1||n==2){
		return 1;
	}else{
		long a=fib(n-1);
		long b=fib(n-2);
		return a+b;
	}
}
	public static void main(String[] args){
		for(int i=1;i<6;i++){
			//System.out.println(fac(i));		
			System.out.println(fib(i));
		}
		
	}
}