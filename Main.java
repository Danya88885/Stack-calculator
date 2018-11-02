package secondprj;

import secondprj.calculator.Calculator;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(new File(" "));
        calculator.calculate();
    }
}
