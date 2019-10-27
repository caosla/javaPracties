public class extremity{
	public static void main(String[] args){
		int a =Integer.parseInt(args[0]);
		int b =Integer.parseInt(args[1]);
		int c =Integer.parseInt(args[2]);
		int max ,min;
		if(a>b){
			max=a;
			min=b;
		}
		else{
			max=b;
			min=a;
		}
		if(max>c){
			System.out.println("最大值为:"+max);
		}
		else{
			max=c;
			System.out.println("最大值为:"+max);
		}
		if(min<c){
			System.out.println("最小值为:"+min);
		}else{
			min=c;
			System.out.println("最小值为:"+min);
		}
	}
	
}