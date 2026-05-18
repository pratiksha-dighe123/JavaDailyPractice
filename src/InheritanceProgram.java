// Parent class
class Animal {

    void sound() {
        System.out.println("Animal makes sound..");
    }
}

// Child class
class Dog extends Animal {

    void bark() {
        System.out.println("Dog barks...");
    }


    public static void main(String[] args) {

        // Creating object of child class
        Dog d = new Dog();

        // Calling parent class method
        d.sound();

        // Calling child class method
        d.bark();
    }
}