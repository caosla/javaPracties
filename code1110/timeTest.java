public class timeTest{
	//属性
	private int hour;
	private int minute;
	private int second;
	//构造方法
	public timeTest(int hour,int minute,int second){
		this.hour=hour;
		this.minute=minute;
		this.second=second;
	}
	//方法
	public void add(int seconds){
		if (seconds<0){
			System.out.println("不合理的秒数");
			return;
		}
		this.second+=seconds;
		while(second>=60){
			second-=60;
			minute+=1;
			if(minute>=60){
				hour+=1;
				minute=0;
				if(hour==24){
					hour=0;
				}
			}
		}
	} 
	public void sub(int seconds){
		if (seconds>=0){
			System.out.println("不合理的秒数");
			return;
		}
		this.second+=seconds;
		while(second<=0){
			second+=60;
			minute-=1;
			if(minute<0){
				hour-=1;
				minute+=60;
				if(hour==0){
					hour=24;
				}
			}
		}
	}
	@Override
	public String toString(){
		return String.format("%02d:%02d:%02d",hour,minute,second);
	}
	public static void main(String[] args){
		timeTest time=new timeTest(15,26,20);
		System.out.println(time);
  		time.add(1000);
		System.out.println(time);
		time.sub(-2000);
		System.out.println(time);
		
	} 
	
}