package secondprj.operators;

import secondprj.calcexp.OperatorException;
import secondprj.calculator.Definition;
import secondprj.reading.Reader;

import java.util.EmptyStackException;
import java.util.Stack;

public class Print implements Operator {
    @Override
    public void execute(Stack<Float> stack, Definition defParams, Reader reader){
        float a;
        try {
            a = stack.peek();
        }
        catch(EmptyStackException e) {
            throw new OperatorException("Can not print. Stack is empty.");
        }
        System.out.println(a);
    }
}
