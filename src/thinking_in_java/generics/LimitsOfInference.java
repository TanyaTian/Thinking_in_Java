package thinking_in_java.generics;

//: generics/LimitsOfInference.java
import java.util.List;
import java.util.Map;

import thinking_in_java.typeinfo.pets.Person;
import thinking_in_java.typeinfo.pets.Pet;

public class LimitsOfInference {
    static void f(Map<Person, List<? extends Pet>> petPeople) {
    }

    public static void main(String[] args) {
        // f(New.map()); // Does not compile
    }
} ///:~
