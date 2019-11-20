public class bikeDome{
	public static void main(String[] args){
		Mybike b=new Mybike();
		System.out.println("当前颜色为:");
		System.out.println(b.getColor());
		b.bikeColor("粉色");
		System.out.println("改色后");
		System.out.println(b.getColor());
		
		System.out.println("加速");
		for(int i=0;i<10;i++){
			b.upSpeedNow();
			System.out.println(b.getRate());
		}
		System.out.println("减速");
		for(int i=0;i<10;i++){
			b.downSpeedNow();
			System.out.println(b.getRate());
		}
		
		
	}
}