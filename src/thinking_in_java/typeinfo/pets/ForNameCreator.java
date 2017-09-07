//: typeinfo/pets/ForNameCreator.java
package thinking_in_java.typeinfo.pets;

import java.util.ArrayList;
import java.util.List;

public class ForNameCreator extends PetCreator {
    private static List<Class<? extends Pet>> types = new ArrayList<Class<? extends Pet>>();
    // Types that you want to be randomly created:
    private static String[] typeNames = { "thinking_in_java.typeinfo.pets.Mutt",
            "thinking_in_java.typeinfo.pets.Pug", "thinking_in_java.typeinfo.pets.EgyptianMau",
            "thinking_in_java.typeinfo.pets.Manx", "thinking_in_java.typeinfo.pets.Cymric",
            "thinking_in_java.typeinfo.pets.Rat", "thinking_in_java.typeinfo.pets.Mouse",
            "thinking_in_java.typeinfo.pets.Hamster" };

    @SuppressWarnings("unchecked")
    private static void loader() {
        try {
            for (String name : typeNames)
                types.add((Class<? extends Pet>) Class.forName(name));
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    static {
        loader();
    }

    public List<Class<? extends Pet>> types() {
        return types;
    }
} ///:~
