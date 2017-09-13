package thinking_in_java.containers;

//: containers/CollectionDataTest.java
import java.util.LinkedHashSet;
import java.util.Set;

import thinking_in_java.net.mindview.util.CollectionData;
import thinking_in_java.net.mindview.util.Generator;

class Government implements Generator<String> {
    String[] foundation = ("strange women lying in ponds "
            + "distributing swords is no basis for a system of " + "government").split(" ");
    private int index;

    public String next() {
        return foundation[index++];
    }
}

public class CollectionDataTest {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<String>(
                new CollectionData<String>(new Government(), 15));
        // Using the convenience method:
        set.addAll(CollectionData.list(new Government(), 15));
        System.out.println(set);
    }
} /* Output:
[strange, women, lying, in, ponds, distributing, swords, is, no, basis, for, a, system, of, government]
*///:~
