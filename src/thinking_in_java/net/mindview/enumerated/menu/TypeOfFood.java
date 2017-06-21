//: enumerated/menu/TypeOfFood.java
package thinking_in_java.net.mindview.enumerated.menu;

import thinking_in_java.net.mindview.enumerated.menu.Food.Appetizer;
import thinking_in_java.net.mindview.enumerated.menu.Food.Coffee;
import thinking_in_java.net.mindview.enumerated.menu.Food.Dessert;
import thinking_in_java.net.mindview.enumerated.menu.Food.MainCourse;

public class TypeOfFood {
    public static void main(String[] args) {
        Food food = Appetizer.SALAD;
        food = MainCourse.LASAGNE;
        food = Dessert.GELATO;
        food = Coffee.CAPPUCCINO;
    }
} ///:~
