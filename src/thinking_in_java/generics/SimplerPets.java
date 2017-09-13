package thinking_in_java.generics;

//: generics/SimplerPets.java
import java.util.List;
import java.util.Map;

import thinking_in_java.net.mindview.util.New;
import thinking_in_java.typeinfo.pets.Person;
import thinking_in_java.typeinfo.pets.Pet;

public class SimplerPets {
    public static void main(String[] args) {
        Map<Person, List<? extends Pet>> petPeople = New.map();
        // Rest of the code is the same...
    }
} ///:~
