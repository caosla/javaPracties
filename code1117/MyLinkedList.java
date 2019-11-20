public class MyLinkedList{
	public static Node BulidLinked(){
	//手动创建一个链表
		Node n1=new Node(1);
		Node n2=new Node(2);
		Node n3=new Node(3);
		Node n4=new Node(4);
		Node n5=new Node(5);
		Node n6=new Node(6);
		//1 2 3 4 5 6
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		n5.next=n6;
		
		return n1;
	}
	//打印链表
	public static void printLinkedList(Node head){
		Node cur=head;
		while(cur!=null){
			System.out.println(cur.val);
			cur=cur.next;
		}
	}
	//头插
	public static Node pushFront(Node head,int val){
		Node node=new Node(val);
		node.next=head;
		return node;
	}
	//头删
	public static Node popFront(Node head){
		if (head==null){
			throw new RuntimeException("空链表");
		}
		return head.next;
	}
	//尾插
	public static Node popFront(Node head,int val){
		Node node=new Node(val);
		if(head==null){
			return node;
		}else{
			Node cur=head;
			while(cur.next!=null){
				cur=cur.next;
			}
			cur.next=node;
			return head;
		}
	}
	//尾删
	public static Node popBack(Node head){
		if(head==null){
			throw new RuntimeException("空的");
		}
		if(head.next==null){
		 return null;
		}else{
			Node cur=head;
			while(cur.next.next==null){
				cur=cur.next;
			}
			cur.next=null;
			
			return head;
		}
		
	}
	public static void main(String[] args){
		Node head=null;
		head=pushFront(head,1);
		head=pushFront(head,2);
		head=pushFront(head,3);
		head=pushFront(head,4);
		printLinkedList(head);
	}
	
}