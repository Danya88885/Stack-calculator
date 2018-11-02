package secondprj.calculator;

import secondprj.calcexp.OperatorException;
import secondprj.operators.Operator;
import secondprj.opfactory.OperatorsFactory;
import secondprj.reading.Reader;

import java.io.File;
import java.util.Stack;

public class Calculator {
    private Stack<Float> stack;
    private Definition definedParams;
    private Reader reader;

    public Calculator (File fileName) {
        stack = new Stack<>();
        definedParams = new Definition();
        reader = new Reader(fileName);
    }

    public void calculate () {
        System.out.println("Welcome to my calculator. You can get the list of all commands typing getcom.");
        while (true) {
            try {
                Operator operator = OperatorsFactory.getOperator(reader.next());
                operator.execute(stack, definedParams, reader);
            } catch (OperatorException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
