class Music{
    public void playMusic(){
        System.out.println("Music is playing");
    }
}

class Movie{
    public String movieName(String name){
        return name;
    }
}


public class Oop{
    public static void main(String[] args){

        Music m1= new Music();
        m1.playMusic();

        Movie m2= new Movie();
        String name= m2.movieName("Dosti");
        System.out.println("Movie name is: " +name);

    }
}