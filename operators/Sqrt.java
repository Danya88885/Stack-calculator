package secondprj.operators;

import secondprj.calcexp.OperatorException;
import secondprj.calculator.Definition;
import secondprj.reading.Reader;

import java.util.EmptyStackException;
import java.util.Stack;

public class Sqrt implements Operator {
    @Override
    public void execute(Stack<Float> stack, Definition defParams, Reader reader){
        float a;
        try {
            a = stack.pop();
        }
        catch(EmptyStackException e) {
            throw new OperatorException("Can not take sqrt. Stack is empty.");
        }
        if(a < 0) {
            stack.push(a);
            throw new OperatorException("Can not take sqrt. Number is < 0");
        }
        stack.push((float)Math.sqrt(a));
    }
}
