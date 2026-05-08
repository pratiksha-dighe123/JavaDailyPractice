public class String_Examples {

    public static void main(String[] args){
        String name= "Pratiksha";
        System.out.println(name);
        System.out.println("Length: " +name.length());
        System.out.println("Uppercase : " +name.toUpperCase());
        System.out.println("Lowercase : " +name.toLowerCase());
        System.out.println(("Character at index 0: " +name.charAt(2)));
        System.out.println("Substring: " +name.substring(0,3));
        System.out.println("Replace: " +name.replace("sha", " "));
        System.out.println("Contains: "+name.contains("tik"));
        System.out.println("Starts with S?: " +name.startsWith("S"));
        System.out.println("Ends with a?: " +name.endsWith("a"));
    }

}
