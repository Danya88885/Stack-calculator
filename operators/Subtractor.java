package secondprj.operators;

import secondprj.calcexp.OperatorException;
import secondprj.calculator.Definition;
import secondprj.reading.Reader;

import java.util.EmptyStackException;
import java.util.Stack;

public class Subtractor implements Operator{
    @Override
    public void execute(Stack<Float>stack, Definition defParams, Reader reader){
        float a, b;
        try {
            a = stack.pop();
        }
        catch(EmptyStackException e) {
            throw new OperatorException("Can not subtract. Stack is empty.");
        }
        try {
            b = stack.pop();
        }
        catch(EmptyStackException e) {
            stack.push(a);
            throw new OperatorException("Can not subtract. There is only 1 element in stack.");
        }
        stack.push(a - b);
    }
}
