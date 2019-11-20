class wall{
	//属性
	String name;
	int age;
	
	//方法
	public void sayhello(String pp){
	System.out.println(name+"的脑子被"+pp+"吃掉了");	
	}
}
//构造器
//1,方法名称必须和类名相同,2不能有返回值
//用来做对象的初始化
public preson(){
	name="sazi";
	age=1;
}
//构造器只有重载

public class preson{
	public static void main(String[] args){
		wall p=new wall();//定义一个wall类
		p.name="张伟";
		p.age=20;
		p.sayhello("zombie");
	}
	
}
//修饰符:访问限定符:public /protectde/default/priva
//this关键字: 构造方法中能够调用其他构造方法
 