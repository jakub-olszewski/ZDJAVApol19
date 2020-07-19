package pl.sdacademy.testowanie.podstawy.tdd;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @since : 19.07.2020
 **/
public class Person {
    public String name;

    public Person(){
        this.name = "name";
    }

    public Person(String name) {
        this.name = name;
    }

    public String name(){
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
