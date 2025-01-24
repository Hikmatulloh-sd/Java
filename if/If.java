public class If {
    public static void main(String[] args){
        if(5 < 4){
            System.out.println("Да, верно.");
        }else{
            System.out.println("не верно");
        }

        int age = 15;

        if (age >= 18){
            System.out.println("Доступ разрешон");
        }else if(age >= 16){
            System.out.println("Доступ разрешон при участии родителей");
        }else{
            System.out.println("Доступ запрещен");
        }
    }
}
