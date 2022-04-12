public class ArrayStack<T> implements Stack<T> {

    private T[]  stack;
    private int count;
    int DEFAULT_SIZE = 8;

    public ArrayStack() {
        stack = (T[]) new Object[DEFAULT_SIZE];
    }

    public ArrayStack(int newSize){
        stack = (T[]) new Object[newSize];
    }


    @Override
    public void push(T item) throws UnsupportedOperationException {
        if(count < stack.length){
            stack[count] = item;
            count++;

        } else {

//            improvement #3 here I wanted to increase the arrayStack size when array is full or half full
//                    but I could not get to work
            if(count == stack.length ) {
                int newSize = DEFAULT_SIZE * 2;
                stack = (T[]) new Object[newSize];
                stack[count] = item;
                count++;

            }

            // if goes wrong
            // throw an exception
            System.out.println("cannot add " + item);

            throw new UnsupportedOperationException();

        }


    }




    @Override
    public T pop() {
//
        try{
            int topIndex = count -1;
            count--;
            return stack[topIndex];
        } catch ( IndexOutOfBoundsException e) {
            System.out.println("Stack is empty now. It cannot be removed anymore");
            return null;
        }
    }

    @Override
    public int length(){
        return count;
    }

    @Override
    public T peek() {
        try{
            int topIndex = count -1;
            return stack[topIndex];
        } catch ( IndexOutOfBoundsException e) {
            System.out.println("Stack is empty now. So, there is no top item");
            return null;
        }
    }

    @Override
    public boolean isEmpty() {

        return count <= 0;
    }


    @Override
    public String toString() {

        String output ="";

        for(int i=0; i< count; i++){
//        for(int i=0; i< stack.length; i++){

            // //faced trouble # I kept getting an error. It didn't show stack data correctly.
                output += stack[i] + " ";


//            if (stack[i] != null) {
//                output += stack[i] + " ";
//            }
        }
        return output;

    }

}
