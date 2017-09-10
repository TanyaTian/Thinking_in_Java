//: typeinfo/packageaccess/HiddenC.java
package thinking_in_java.typeinfo.packageaccess;
import thinking_in_java.typeinfo.interfacea.*;
import static thinking_in_java.net.mindview.util.Print.*;

class C implements A {
  public void f() { print("public C.f()"); }
  public void g() { print("public C.g()"); }
  void u() { print("package C.u()"); }
  protected void v() { print("protected C.v()"); }
  private void w() { print("private C.w()"); }
}

public class HiddenC {
  public static A makeA() { return new C(); }
} ///:~
