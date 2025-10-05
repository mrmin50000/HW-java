import java.util.LinkedList;
import java.util.Queue;

public class StackOnQueue {
	private Queue<Integer> queue1;
	private Queue<Integer> queue2;

	public StackOnQueue() {
		queue1 = new LinkedList<>();
		queue2 = new LinkedList<>();
	}

	public void push(int x) {
		queue2.offer(x);

		while (!queue1.isEmpty()) {
			queue2.offer(queue1.poll());
		}

		Queue<Integer> temp = queue1;
		queue1 = queue2;
		queue2 = temp;
	}

	public int pop() {
		if (empty()) {
			throw new IllegalStateException("Stack is empty");
		}
		return queue1.poll();
	}

	public int top() {
		if (empty()) {
			throw new IllegalStateException("Stack is empty");
		}
		return queue1.peek();
	}

	public boolean empty() {
		return queue1.isEmpty();
	}

	public String toString() {
		if (empty()) {
			return "[]";
		}

		Queue<Integer> tempQueue = new LinkedList<>(queue1);
		StringBuilder sb = new StringBuilder();
		sb.append("[");

		while (!tempQueue.isEmpty()) {
			sb.append(tempQueue.poll());
			if (!tempQueue.isEmpty()) {
				sb.append(", ");
			}
		}

		sb.append("]");
		return sb.toString();
	}

	public int size() {
		return queue1.size();
	}

	public static void main(String[] args) {
		StackOnQueue stack = new StackOnQueue();

		stack.push(1);
		stack.push(2);
		stack.push(3);

		System.out.println(stack.toString());

		stack.pop();

		System.out.println(stack.toString());
	}
}
