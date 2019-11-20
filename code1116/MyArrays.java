import java.util.Arrays;

public class MyArrays{
    private int[] array;
	private int size;
	
	public MyArrays(){
		array=new int[10];
		size=0;
	}
	//尾插
	public void pushBack(int element){
		array[size++]=element;
	}
	//尾删
	public void popBack(){
		array[--size]=0;
	}
	//头插
	public void pushFront(int element){
		//把原有的数据后移
		for(int i=size-1;i>=0;i--){
			array[i+1]=array[i];
		}
		array[0]=element;
		size++;
	}
	//头删
	public void popFront(){
		for(int i=1;i<=size-1;i++){
			array[i-1]=array[i];
		}
		array[--size]=0;
	}
	//根据下标进行插入
	public void insert(int element,int index){
		for(int i=size-1;i>=index;i--){
			array[i+1]=array[i];
		}
		array[index]=element;
		size++;
	}
	//根据下标进行删除
	public void outsert(int index){
		for(int i=index+1;i<=size;i++){
			array[i-1]=array[i];
		}
		array[--size]=0;
	}
	
	
	@Override
	public String toString(){
		return Arrays.toString(Arrays.copyOf(array,size));
	}
		
	public static void main(String[] args){
		MyArrays list=new MyArrays();
		list.pushBack(1);
		list.pushBack(2);
		list.pushBack(3);
		list.pushBack(4);
		System.out.println(list);
		list.popBack();
		System.out.println(list);
		list.pushFront(10);
		System.out.println(list);
		list.popFront();
		System.out.println(list);
		list.insert(20,2);
		System.out.println(list);
		list.outsert(2);
		System.out.println(list);
	}
}