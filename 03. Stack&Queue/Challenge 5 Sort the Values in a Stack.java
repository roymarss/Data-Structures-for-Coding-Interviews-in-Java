class CheckSort {
    public static void sortStack(Stack<Integer> stack) {
		Stack<Integer> newstack  = new Stack<>(stack.getMaxSize());
		while(!stack.isEmpty()){
			Integer value = stack.pop();
			while(!newstack.isEmpty() && value >= newstack.top()){
				newstack.push(value);
			}else{
				while(!newstack.isEmpty() && value < newstack.top()){
					stack.push(newstack.pop());
				}

				newstack.push(value);
			}
		}

		while(!newstack.isEmpty())
			stack.push(newstack.pop());

	}
}

//=====================iteratively
class CheckSort {
  public static void insert(Stack<Integer> stack, int value) {
      if(stack.isEmpty()|| value < stack.top())
          stack.push(value);
      else{
          int temp = stack.pop();
          insert(stack,value);
          stack.push(temp);
      }
  }
  public static Stack<Integer> sortStack(Stack<Integer> stack) {
      if(!stack.isEmpty()) {
          int value = stack.pop();
          sortStack(stack);
          insert(stack,value);
      }
      return stack;
  }
    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<Integer>(7);
        stack.push(2);
        stack.push(97);
        stack.push(4);
        stack.push(42);
        stack.push(12);
        stack.push(60);
        stack.push(23);
        sortStack(stack);
        while(!stack.isEmpty()){
              System.out.println(stack.pop());
          }
    }
}//end of class

