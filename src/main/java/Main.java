import java.io.IOException;
import java.io.Serializable;

public class Main {
    public static void main(String[] args) {
        FileOperations fileOps = new FileOperationsImpl();
        String filename = "data.ser";

        // Пример объекта для записи
        Person person = new Person("John", 30);

        try {
            fileOps.writeToFile(filename, person);
            Person readPerson = (Person) fileOps.readFromFile(filename);
            System.out.println("Name: " + readPerson.getName() + ", Age: " + readPerson.getAge());
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
    }
}

class Person implements Serializable {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}



