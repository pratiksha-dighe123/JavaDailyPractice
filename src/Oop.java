class Music{
    public void playMusic(){
        System.out.println("Music is playing");
    }
}

class Pen{
    public String buyPen(int cost){
        if(cost >= 10)
            return "Pen is bought";
        else
            return "Pen is not available";
    }
}


public class Oop{
    public static void main(String[] args){

        Music m1= new Music();
        m1.playMusic();

        Pen p1= new Pen();
        System.out.println(p1.buyPen(20));
    }
}