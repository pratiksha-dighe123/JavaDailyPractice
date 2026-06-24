class Student1{
    private int id;
    private String name;

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public void setId(int id){
        this.id= id;
    }
    public void setName(String name) {
        this.name = name;
    }
}


public class EncapsulationDemo {

    public static void main(String[] args){
        Student1 s1= new Student1();
        s1.setId(101);
        s1.setName("Rahul");

        System.out.println("Student id: " +s1.getId());
        System.out.println("Student name: " +s1.getName());
    }

}
