package model;

import java.util.Objects;

public abstract class Person {

    String name;
    Gender gender;
    Integer age;

    Person(String name, Gender gender, Integer age) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Person person = (Person) o;
        return name.equals(person.name) &&
                gender == person.gender &&
                age.equals(person.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, gender, age);
    }
}
