import java.util.Stack;

public class TestStack
{
    public static void main(String[] args)
    {
        Stack<String> stack = new Stack<>();
        stack.push("Arby's");
        stack.push("Burger King");
        stack.push("Chick-fil-A");

        printStack(stack);

        String whatToEat = stack.pop();
        System.out.println("You should eat " + whatToEat + ".");

        printStack(stack);
    }

    public static void printStack(Stack<String> stack)
    {
        for (String item : stack)
        {
            System.out.println(item);
        }
    }
}
