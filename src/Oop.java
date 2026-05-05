
class Operations{

    public int add(int n1, int n2){
        int result= n1+n2;
        return result;
    }
}

public class Oop {

    public static void main(String[] args){

//        int num1= 10;
//        int num2= 20;

        Operations opr=  new Operations();
        int sum= opr.add(10,10);
        System.out.println("The sum is: " +sum);
    }
}
