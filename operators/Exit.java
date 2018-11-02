package secondprj.operators;

import secondprj.calculator.Definition;
import secondprj.reading.Reader;

import java.util.Stack;

public class Exit implements Operator {
    @Override
    public void execute (Stack<Float> stack, Definition defParams, Reader reader ) {
        System.out.println("Thanks for using my program.\n                          Created by Daniar Ahmetov.\n                          All rights reserved!");
        System.exit(0);
    }
}
