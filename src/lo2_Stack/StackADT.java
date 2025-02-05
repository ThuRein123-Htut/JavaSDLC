package lo2_Stack;

public class StackADT implements StackInterface{
	int top;
	String arr[];
	int size;
	
	StackADT(int size){
		this.top = 1;
		this.arr = new String[size];
	
}
	@Override
	public void push(String element) {
		if(!isFull()) {
			this.arr[++top] = element;
		}
		else {
			System.out.println("Stack is full.");
		}
}
	
	@Override
	public String pop() {
		if(!isEmpty()) {
			return this.arr[top--];
		}
		return "Stack is empty";
	}

	@Override
	public int peek() {
		return top;
	}

	@Override
	public int size() {
		return arr.length -1;
	}

	@Override
	public boolean isFull() {
		return this.top == this.arr.length-1;
	}

	@Override
	public boolean isEmpty() {
		return this.top == -1;
	}
}
