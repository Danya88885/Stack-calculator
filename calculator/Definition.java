package secondprj.calculator;

import secondprj.calcexp.OperatorException;

import java.util.ArrayList;

public class Definition {
    private ArrayList<String> names;
    private ArrayList<Float> values;

    public Definition () {
        names = new ArrayList<>();
        values = new ArrayList<>();
    }

    public void setDefinition(String name, float value) {
        values.add(value);
        names.add(name);
    }

    public float getDefinition(String name) {
        int j = 0;
        for(var i : names) {
            if (i.equals(name))
                return values.get(j);
            j++;
        }
        throw new OperatorException("This statement wasn't defined.");
    }
}
