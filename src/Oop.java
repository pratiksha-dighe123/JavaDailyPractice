
class Computer{
    public String playMusic(){
        return "Music is playing...";
    }
}

class Store{
    public int getItem(int cost){
        return cost;
    }
}


public class Oop{
    public static void main(String[] args){

        Computer c1= new Computer();
        c1.playMusic();

        Store s1= new Store();
        s1.getItem(100);

    }
}