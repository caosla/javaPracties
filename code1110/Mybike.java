class Mybike{
	String color;//属性
	int speedNow;
	int speedmax;
	//构造类
	 Mybike(){
		color="红色";
		speedNow=10;
		speedmax=70;
	}
	void bikeColor(String color){
		this.color=color;
	}
	void upSpeedNow(){
		speedNow+=10;
		if(speedNow>=speedmax){
			speedNow=speedmax;
		}
	}
	void downSpeedNow(){
		speedNow-=10;
		if(speedNow<=0){
			speedNow=0;
		}
	}
	public String getColor(){
		return color;
	}
	public int getRate(){
		return speedNow;
	}
}