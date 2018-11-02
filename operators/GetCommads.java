package secondprj.operators;

import secondprj.calculator.Definition;
import secondprj.reading.Reader;

import java.util.Stack;

public class GetCommads implements Operator {
    @Override
    public void execute(Stack<Float> stack, Definition def, Reader reader) {
        System.out.println("# - comment\n\ndefine [name] [value] - make definition\npush - add element to stack\npop - pop element from stack\n\n/ - divide\n* - multiply\n+ - summarise\n- - subtract\nsqrt - get sqrt\n\nprint - print element of stack not deleting this element\nexit - exit the program");
    }
}
