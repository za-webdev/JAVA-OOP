public class Sll{
	private Node head;

	public Sll(){
		this.head=null;
	}

	public void add(int val){
		Node newNode= new Node (val);
		if(head==null){
			
			this.head =newNode;
		}
		else{	
		Node runner=this.head;

		while(runner.getNext()!=null){
			runner = runner.getNext();
		}

		runner.setNext(newNode);

		}
	}

	public void printValues(){
		if(head==null){
			System.out.println("It is null");
		}

		else{

			Node runner = this.head;
			while(runner !=null){
				System.out.println(runner.getVal());
				runner= runner.getNext();
			}
		}

		
	}
}