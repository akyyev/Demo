package data.algorithms;

import java.util.List;

public class TestApp {
    public static void main(String[] args) {
        var linkedList = new CustomLinkedList<Student>();
        System.out.println("linkedList.isEmpty() = " + linkedList.isEmpty());

        linkedList.addElement(new Student("First", "Doe"));
        linkedList.addElement(new Student("Second", "Done"));
        linkedList.addElement(new Student("Third", "Kim"));

        linkedList.addAll(List.of(new Student("1", "00"), new Student("2", "00")));
        linkedList.addElementToBeginning(new Student("#1", "00"));
        linkedList.printAll();
        System.out.println("linkedList.getSize() = " + linkedList.getSize());

        System.out.println("linkedList.indexOf(new Student(\"Second\", \"Done\")) = "
                + linkedList.indexOf(new Student("Second", "Done")));

        System.out.println("linkedList.contains(new Student(\"Gary\", \"Hill\")) = "
                + linkedList.contains(new Student("Gary", "Hill")));

        System.out.println("-----------------------------------------");
        var otherLinkedList = new CustomLinkedList<String>();
        otherLinkedList.addAll(List.of("Some", "One", "Is", "Learning", "Algorithms"));

        System.out.println("otherLinkedList.indexOf(\"Learning\") = " + otherLinkedList.indexOf("Learning")); // 3
        System.out.println("otherLinkedList.indexOf(\"Algorithms\") = " + otherLinkedList.indexOf("Algorithms")); // 4
        System.out.println("otherLinkedList.indexOf(\"Invalid\") = " + otherLinkedList.indexOf("Invalid"));  // -1


        otherLinkedList.delete("One");
        otherLinkedList.delete("Some");
        otherLinkedList.delete("Algorithms");
        var isDeleted = otherLinkedList.delete("InvalidElement");

        otherLinkedList.printAll();
        System.out.println("isDeleted = " + isDeleted);

        System.out.println("-----------------------------------------");
        var other = new CustomLinkedList<String>();
        other.addAll(List.of("A", "B", "C", "D", "E", "F")); // k=3

        other.printAll();


        System.out.println("other.getKthElementFromLast(3) = " + other.getKthElementFromLast(3));
        System.out.println("-----------------------------------------");
        other.removeKthElementFromLast(6);
        other.printAll();
    }
}

class Student {
    String name;
    String lastName;

    public Student(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student other = (Student) o;
        return this.name.equals(other.name) && this.lastName.equals(other.lastName);
    }

    @Override
    public int hashCode() {
        return 13 * name.hashCode() + 7 * lastName.hashCode();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}