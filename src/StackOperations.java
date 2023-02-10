public class StackOperations {
    public static void main(String[] args) {
        int plate;
        LinkedStack lottaPlates = new LinkedStack();

        // adding some plates
        plate = 25;
        for(int i = plate; i < 150; i++) {
            lottaPlates.push(i + 5);
        }

        // is the stack empty?
        if(lottaPlates.isEmpty()) {
            System.out.println("Empty Stack");
        } else {

            // peek at the top
            System.out.println("Peeking at the top = " + lottaPlates.peek());

            // show the size
            System.out.println("Size of the stack = " + lottaPlates.size());

            // pop off the top
            System.out.println("Popping the top = " + lottaPlates.pop());
        }

        /* We have 125 plates. I want to remove the 50th...
        * start at the top and pop them off until you get to 50 */
         for( int j = lottaPlates.size(); j >= 50; j--) {
             System.out.println(lottaPlates.size());
             lottaPlates.pop();
         }
    }
}
