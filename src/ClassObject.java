class ClassObject {

    // Data members
    int id = 101;
    String name = "Pratiksha";

    // Method
    public void display() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
    }

    public static void main(String[] args) {

        // Creating object
        ClassObject obj = new ClassObject();

        // Accessing method using object
        obj.display();
    }
}