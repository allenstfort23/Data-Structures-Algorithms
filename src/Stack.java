/*Stack interface that lets you
* pop, push, peek, check if empty*/
public interface Stack {

    // add to the top
    void push(int plate);

    // remove from the top
    int pop();

    // look at the first item
    int peek();

    // how many elements?
    int size();

    // is the stack empty?
    boolean isEmpty();
}
