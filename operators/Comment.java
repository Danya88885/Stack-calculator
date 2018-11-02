package secondprj.operators;

import secondprj.calculator.Definition;
import secondprj.reading.Reader;

import java.util.Stack;

public class Comment implements Operator{
    @Override
    public void execute(Stack<Float> stack, Definition defParams, Reader reader) {
        reader.skipLine();
    }
}
