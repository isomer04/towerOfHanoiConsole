import java.util.Stack;

public class JavaUtilStackTest {
    public static void main(String[] args) {
        Stack<Integer> numStack = new Stack<>();

        System.out.println("Initial stack contents: " + numStack);

        for (int i = 1; i < 7; i++) {
            numStack.push(i);
        }

        System.out.println("Contents of stack: " + numStack);

//        for (int i = 1; i < 7; i++) {
//            //System.out.println("Peeking item at top (that's about to be removed): " + numStack.peek());
//            //numStack.pop();
//
//            System.out.println("Removing item: " + numStack.pop());
//
//            //int topThing = numStack.pop();
//        }

        while(!numStack.isEmpty()) {
            System.out.println("Removing item: " + numStack.pop());
        }

        System.out.println("Contents of stack: " + numStack);
    }
}