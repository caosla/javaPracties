import java.util.Scanner;
import java.util.Random;
public class guessGame{
	public static void main(String[] args){
		//生成随机数
		Random s=new Random();
		int toGuess=s.nextInt(100);
		//用户输入
		Scanner input=new Scanner(System.in);
		//给用户5次机会
		int time = 5;
		int i = 1;
		System.out.println("游戏开始,您有5次机会");
		for(i=1;i<=5;i++){
			System.out.println("请输入一个0到100的数字");
			int sum=input.nextInt();
			if(sum>toGuess){
				System.out.println("数字高了");
			}else if(sum<toGuess){
				System.out.println("数字低了");
			}else{
				System.out.println("恭喜你猜对了");
				break;
			}
		}
		if(i>5){
			System.out.println("游戏结束,YOU DEAD");
		}
		//判断
		//输出游戏结果
	}
}