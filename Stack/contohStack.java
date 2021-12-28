package Stack;

public class contohStack {
    // Field
    public int[] data;
    public int top = 0;

    //Constructor
    public contohStack(int n) {
        data = new int[n];
    }

    //Method
    public boolean isEmpty() {
        return top == 0;
    }

    //Method
    public boolean isFull() {
        return top == data.length;
    }

    //Method
    public void push(int value) {
        if ( !isFull() ) {
            data[top] = value;
            top = top + 1;
        } else {
            System.out.println("Stack Penuh!!");
        }
    }

    //Method
    public int pop() {
        if ( !isEmpty() ) {
            top = top - 1;
            int ret = data[top];
            return ret;
        } else {
            return -1;
        }
    }
}
