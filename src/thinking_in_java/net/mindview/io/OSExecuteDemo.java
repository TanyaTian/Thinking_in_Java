package thinking_in_java.net.mindview.io;

import thinking_in_java.net.mindview.util.OSExecute;


//: io/OSExecuteDemo.java
// Demonstrates standard I/O redirection.


public class OSExecuteDemo {
  public static void main(String[] args) {
    OSExecute.command("javap OSExecuteDemo");
  }
} /* Output:
Compiled from "OSExecuteDemo.java"
public class OSExecuteDemo extends java.lang.Object{
    public OSExecuteDemo();
    public static void main(java.lang.String[]);
}
*///:~
