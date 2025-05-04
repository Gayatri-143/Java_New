// Stack Interface
interface Stack {
    void push(int item);
    int pop();
    void display();
    boolean overflow();
    boolean underflow();
}

// IntegerStack Class implementing Stack interface
class IntegerStack implements Stack {
    private int[] stack;
    private int top;
    private int size;

    // Constructor
    public IntegerStack(int size) {
        this.size = size;
        stack = new int[size];
        top = -1;
    }

    // Push method
    @Override
    public void push(int item) {
        if (overflow()) {
            System.out.println("Stack Overflow! Cannot push " + item);
        } else {
            stack[++top] = item;
            System.out.println(item + " pushed to stack.");
        }
    }

    // Pop method
    @Override
    public int pop() {
        if (underflow()) {
            System.out.println("Stack Underflow! No element to pop.");
            return -1;
        } else {
            System.out.println(stack[top] + " popped from stack.");
            return stack[top--];
        }
    }

    // Display method
    @Override
    public void display() {
        if (underflow()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.print("Stack elements: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }

    // Check for Overflow
    @Override
    public boolean overflow() {
        return top == size - 1;
    }

    // Check for Underflow
    @Override
    public boolean underflow() {
        return top == -1;
    }
}

// Test Class
public class TestStack {
    public static void main(String[] args) {
        IntegerStack stack = new IntegerStack(5);

        stack.pop(); // Underflow check

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();

        stack.pop();
        stack.display();

        stack.push(40);
        stack.push(50);
        stack.push(60);
        stack.push(70); // Overflow check

        stack.display();
    }
}
