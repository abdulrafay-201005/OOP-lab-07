// Task 3a: Base class Animal
public class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age  = age;
    }
}
// Task 3b: Dog subclass
public class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);   
    }
}

// Task 3c: Cat subclass
public class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);  
    }
}
public class PrintAnimalMain {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", 5);
        Cat cat = new Cat("Whiskers", 3);

        System.out.println("Dog: " + dog.name + ", Age: " + dog.age);
        System.out.println("Cat: " + cat.name + ", Age: " + cat.age);
    }
}