package secondprj.operators;

import secondprj.calculator.Definition;
import secondprj.reading.Reader;
import java.util.Stack;

public interface Operator {
    void execute(Stack<Float> stack, Definition defParams, Reader reader );
}
