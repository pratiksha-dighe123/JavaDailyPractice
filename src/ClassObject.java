class ClassObject {

    // Data members
    int id = 101;
    String name = "Pratiksha Dighe";

    // Method
    void display() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
    }

    public static void main(String[] args) {

        // Creating object
        Student s1 = new Student();

        // Calling method
        s1.display();
    }
}