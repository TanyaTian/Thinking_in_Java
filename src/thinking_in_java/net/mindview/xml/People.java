package thinking_in_java.net.mindview.xml;


//: xml/People.java
// {Requires: nu.xom.Node; You must install
// the XOM library from http://www.xom.nu }
// {RunFirst: Person}
import nu.xom.*;

import java.io.FileInputStream;
import java.util.*;

public class People extends ArrayList<Person> {
  public People(String fileName) throws Exception  {
      FileInputStream in = new FileInputStream(fileName);
    Document doc = new Builder().build(in);
    Elements elements =
      doc.getRootElement().getChildElements();
    for(int i = 0; i < elements.size(); i++)
      add(new Person(elements.get(i)));
  }
  public static void main(String[] args) throws Exception {
    People p = new People("People.xml");
    System.out.println(p);
  }
} /* Output:
[Dr. Bunsen Honeydew, Gonzo The Great, Phillip J. Fry]
*///:~
