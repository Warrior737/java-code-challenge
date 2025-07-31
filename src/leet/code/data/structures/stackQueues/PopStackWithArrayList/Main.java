package leet.code.data.structures.stackQueues.PopStackWithArrayList;

public class Main {
    public static void main(String[] args) {
        PopStackWithArrayList<Integer> stack;

        // Test 1: Pop single element
        System.out.println("Test 1: Pop Single Element");
        stack = new PopStackWithArrayList<>();
        stack.push(10);
        System.out.println("Popped: " + stack.pop());
        System.out.println("Expected Stack: empty");
        System.out.println("Actual Stack:");
        stack.printStack();
        System.out.println("Peek: " + stack.peek());
        System.out.println("Size: " + stack.size());
        System.out.println();

        // Test 2: Pop multiple elements (LIFO order)
        System.out.println("Test 2: Pop Multiple Elements (LIFO)");
        stack = new PopStackWithArrayList<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Popped: " + stack.pop()); // Expect 3
        System.out.println("Popped: " + stack.pop()); // Expect 2
        System.out.println("Popped: " + stack.pop()); // Expect 1
        System.out.println("Expected Stack: empty");
        System.out.println("Actual Stack:");
        stack.printStack();
        System.out.println();

        // Test 3: Pop leaves correct remainder
        System.out.println("Test 3: Pop Leaves Correct Remainder");
        stack = new PopStackWithArrayList<>();
        stack.push(5);
        stack.push(6);
        stack.push(7);
        System.out.println("Popped: " + stack.pop()); // Expect 7
        System.out.println("Expected Stack (top to bottom): 6, 5");
        System.out.println("Actual Stack:");
        stack.printStack();
        System.out.println("Peek: " + stack.peek());
        System.out.println("Size: " + stack.size());
        System.out.println();

        // Test 4: Pop from empty stack
        System.out.println("Test 4: Pop from Empty Stack");
        stack = new PopStackWithArrayList<>();
        System.out.println("Popped: " + stack.pop()); // Expect null
        System.out.println("Expected Stack: empty");
        System.out.println("Actual Stack:");
        stack.printStack();
        System.out.println("Peek: " + stack.peek());
        System.out.println("Size: " + stack.size());
        System.out.println();

        /*
            EXPECTED OUTPUT:
            ----------------
            Test 1: Pop Single Element
            Popped: 10
            Expected Stack: empty
            Actual Stack:
            Peek: null
            Size: 0

            Test 2: Pop Multiple Elements (LIFO)
            Popped: 3
            Popped: 2
            Popped: 1
            Expected Stack: empty
            Actual Stack:

            Test 3: Pop Leaves Correct Remainder
            Popped: 7
            Expected Stack (top to bottom): 6, 5
            Actual Stack:
            6
            5
            Peek: 6
            Size: 2

            Test 4: Pop from Empty Stack
            Popped: null
            Expected Stack: empty
            Actual Stack:
            Peek: null
            Size: 0
        */
    }

}
