package secondprj.operators;

import secondprj.calcexp.OperatorException;
import secondprj.calculator.Calculator;
import secondprj.calculator.Definition;
import secondprj.reading.Reader;

import java.util.Stack;

public class Poper implements Operator{
    @Override
    public void execute(Stack<Float> stack, Definition defParams, Reader reader){
        if(stack.empty())
            throw new OperatorException("There are no elements in stack. Can not pop ones.");
        stack.pop();
    }
}
