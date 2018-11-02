package secondprj.operators;

import secondprj.calcexp.OperatorException;
import secondprj.calculator.Definition;
import secondprj.reading.Reader;
import java.util.Stack;

public class Define implements Operator {
    @Override
    public void execute(Stack<Float> stack, Definition defParams, Reader reader){
        String name = reader.next();
        String value = reader.next();
        try {
            defParams.setDefinition(name, Float.valueOf(value));
        }
        catch(NumberFormatException e) {
            throw new OperatorException("Can not define a statement as another one");
        }
    }
}
