//: annotations/Testable.java
package thinking_in_java.annotation;

import thinking_in_java.net.mindview.atunit.Test;

public class Testable {
    public void execute() {
        System.out.println("Executing..");
    }

    @Test
    void testExecute() {
        execute();
    }
} ///:~
