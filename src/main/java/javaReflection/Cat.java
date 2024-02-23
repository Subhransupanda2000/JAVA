package javaReflection;

import java.lang.reflect.Field;

public class Cat {

    private final String name;
    private int age;

    Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String setName(String name) {
        return name;
    }

    public int setAge(int age) {
        return age;
    }
}

class ChildClass {
    public static void main(String[] args) {
        Cat myCat = new Cat("sital", 98);

        try {
            Field[] myFields = myCat.getClass().getDeclaredFields();
            for (Field field : myFields) {
                field.setAccessible(true);

                System.out.println(field.getName() + ": " + field.get(myCat));
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
