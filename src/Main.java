public class Main {
    public static void main(String[] args) {
        RecursiveClass rc1 = new RecursiveClass(3);
        rc1.recursion();

        LinkedListNode<String> lln1 = new LinkedListNode<>("Test1", null);

        lln1.append("Test2");
        lln1.append("Test3");
        lln1.append("Test4");

        if(lln1.contains("Test5")) {
            System.out.println("LLN has Test5");
        } else {
            System.out.println("LLN does not have Test5");
        }

        if(lln1.contains("Test3")) {
            System.out.println("LLN has Test3");
        } else {
            System.out.println("LLN does not have Test3");
        }

        Stack<String> stack1 = new Stack<>();

        stack1.push("Create stack frame");
        stack1.push("Create variable");
        stack1.push("Edit variable");
        stack1.push("Cross out stack frame");

        while(stack1.peek() != null) {
            System.out.println(stack1.pop());
        }
    }
}