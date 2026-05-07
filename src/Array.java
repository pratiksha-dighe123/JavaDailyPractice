import java.sql.SQLOutput;

public class Array {

    public static void main(String[] args){
        int[] arr= {2,3,4,5};
        arr[0] = 8;
        arr[2]= 3;

        for(int i=0; i<=3; i++){
            System.out.println(arr[i]);
        }
    }

}
