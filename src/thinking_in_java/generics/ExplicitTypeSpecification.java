package thinking_in_java.generics;

//: generics/ExplicitTypeSpecification.java
import java.util.List;
import java.util.Map;

import thinking_in_java.net.mindview.util.New;
import thinking_in_java.typeinfo.pets.Person;
import thinking_in_java.typeinfo.pets.Pet;

public class ExplicitTypeSpecification {
    static void f(Map<Person, List<Pet>> petPeople) {
    }

    public static void main(String[] args) {
        f(New.<Person, List<Pet>> map());
    }
} ///:~
