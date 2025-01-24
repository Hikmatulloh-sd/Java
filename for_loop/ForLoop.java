public class ForLoop {
    public static void main(String[] args){
        String name = "Hikmatulloh";

        for(int i = 0; i<=10;i++){ // i++ == i = i + 1
            System.out.println("Hello "+i);
        }
        
        for(int i = 0;i < name.length();i++){
            System.out.println(name.charAt(i));
        }
    }
}
