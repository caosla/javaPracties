public class CalcAverage{
	public static void main(String[] args){
			int result=0;
		for(int i=0;i<args.length;i++){
			int x =Integer.parseInt(args[i]);
			result=result+x;
		}
		double j=1.0*result/args.length;
		System.out.println("输入的数字的平均数为:"+j);
	}
	
}