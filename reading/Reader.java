package secondprj.reading;

import java.io.File;
import java.util.Scanner;

public class Reader {
    private Scanner scanner;

    public Reader(File fileName) {
        try {
            scanner = new Scanner(fileName);
            if(!scanner.hasNext()) {
                throw new Throwable();
            }
        }
        catch(Throwable t) {
            scanner = new Scanner(System.in);
        }
    }

    public String next() {
        return scanner.next();
    }
    public float nextFloat() {
        return scanner.nextFloat();
    }
    public void skipLine() {
        scanner.nextLine();
    }
}
