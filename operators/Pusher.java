package secondprj.operators;

import secondprj.calcexp.OperatorException;
import secondprj.calculator.Definition;
import secondprj.reading.Reader;

import java.util.Stack;

public class Pusher implements Operator {
    @Override
    public void execute(Stack<Float> stack, Definition defParams, Reader reader) {
        String pushing;
        pushing = reader.next();
        try {
            float a = defParams.getDefinition(pushing);
            stack.push(a);
        } catch (OperatorException e) {
            try {
                float a = Float.valueOf(pushing);
                stack.push(a);
            } catch (NumberFormatException ex) {
                throw new OperatorException("Can not an push undefined statement");
            }
        }
    }
}
