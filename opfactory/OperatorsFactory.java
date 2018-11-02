package secondprj.opfactory;

import secondprj.calcexp.OperatorException;
import secondprj.operators.*;

public class OperatorsFactory {
    public static Operator getOperator(String param) {
        switch(param) {
            case "getcom" :
                return new GetCommads();
            case "#" :
                return new Comment();
            case "define" :
                return new Define();
            case "pop" :
                return new Poper();
            case "push" :
                return new Pusher();
            case "print" :
                return new Print();
            case "sqrt" :
                return new Sqrt();
            case "-" :
                return new Subtractor();
            case "+" :
                return new Summariser();
            case "*" :
                return new Multiply();
            case "/" :
                return new Divide();
            case "exit" :
                return new Exit();
            default :
                throw new OperatorException("You try to invoke the operator which does not exist.");
        }
    }
}
