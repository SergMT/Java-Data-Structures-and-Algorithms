import java.util.Stack;

public class Stacks{
	public static void main(String[] args){

		//Stack = LIFO data structure. Last-In First-Out
			  // stores objects into a sort of "vertical tower"
			  // push() to add to the top
			  // pop() to remove from the top

		Stack<String> stack = new Stack<String>();

		stack.push("God of War");
		stack.push("Shadow of the Colossus");
		stack.push("Batman Arkham Knight");
		stack.push("Blasphemous");
		stack.push("Injustice");

		System.out.println("Is the stack empty? \n" + stack.empty());
		
		stack.pop();
		stack.pop();
		stack.pop();

		System.out.println(stack);

		System.out.println("Last stack item: " + stack.peek());

		System.out.println(stack.search("Injustice"));
		System.out.println(stack.search("God of War"));
		System.out.println(stack.search("Grime"));
		
		// Use of stacks
		// 1. Undo/redo things done (Ctrl + Z)
		// 2. Moving back/forward through browser history
		// 3. Backtracking algorithms (maze, file directories)
		// 4. Calling functions (call stack)
	}
}