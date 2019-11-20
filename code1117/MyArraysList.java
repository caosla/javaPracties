import java.util.Arrays;
public class MyArraysList{
	int[] arrays;
	int size;
	public MyArraysList(int capacity){
		arrays=new int[capacity];
		size=0;
	}
	public void pushFront(int element){
		arrays[size++]=element;
	}
	public void popFront(){
		arrays[--size]=0;
	}
	public void insert(int index,int element){
		if(index>size||index<0){
			throw new ArrayIndexOutOfBoundsException(index);
		}
		boolean r=checkCapacity(1);
		if(r==0){
			ensureCapacity();
		}
		for(int i=size-1;i>=index;i--){
			arrays[i+1]=arrays[i];
		}
		arrays[index]=element;
		size++;
	}
	public void outsert(int index){
		for(int i=index+1;i<=size-1;i++){
			arrays[i]=arrays[i-1];
		}
		arrays[--size]=0;
	}
	public void pushBack(int element){
		insert(0,element);
	}
	public void popBack(){
		outsert(0);
	}
	//检查容量是否足够
	boolean checkCapacity(int num){
		return size+num<=arrays.length;
		
	}
	public void ensureCapacity(){
		//newLength=arrays.length*2;
		arrays=Arrays.copy(arrays,arrays.length*2);
	}
	@Override
	public String toString(){
		return Array.toString(Arrays.copyOf(arrays,size));
	}
	
	public static void main(String[] args){
		MyArraysList list=new MyArraysList(2);
		list.pushFront(1);
		list.pushFront(2);
		list.pushFront(3);
		list.pushFront(4);
		
	}
	
}