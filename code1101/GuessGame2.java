import java.util.Scanner;
import java.util.Random;
public class GuessGame2{
	public static int LevelDifficult(){
		System.out.println("请选择难度:1简单,2普通,3困难");
		Scanner scanner=new Scanner(System.in);
			int difficult=scanner.nextInt();
			scanner.nextLine();
			return difficult;
	}
	public static int generateRandom(int difficult){
		Random random=new Random();
		switch(difficult){
			case 1:return random.nextInt(50);
			case 2:return random.nextInt(100);
			case 3:return random.nextInt(150);
		}
		return -1;
	}
	public static int generateTimes(int difficult){
		switch(difficult){
			case 1:return 10;
			case 2:return 7;
			case 3:return 5;
		}
		return -1;
	}
	public static boolean guess(int r){
		System.out.println("请输入数字:");
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		scanner.nextLine();
		if(n==r){
			return true;
		}else if(n<r){
			System.out.println("数字低了");
		}else if(n>r){
			System.out.println("数字高了");
		}
		return false;
	}
	public static void main(String[] args){
		//选择难度
		int difficult=LevelDifficult();
		//生成随机数
		int r=generateRandom(difficult);
		int times=generateTimes(difficult);
		System.out.println("可以猜"+times+"次");
		//循环x次机会
		boolean scueess=false;
		for(int i=0;i<times;i++){
			 scueess=guess(r);
			if(scueess){
				break;
			}
		}
		//读取用户输入并给出对应提示
		//给出游戏结果
		if(scueess){
			System.out.println("恭喜你猜中了");
		}else{
			System.out.println("GAME OVER,YOU DEAD");
		}
	}
}