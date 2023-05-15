public class Singletone {
    
    private static Singletone singletone;

    private Singletone(){}

    public static Singletone getInstance(){

        if(singletone == null){

            singletone = new Singletone();

        }return singletone;
    }
    
    public static void main(String[] args) {
        
        Singletone s1 = singletone.getInstance();

        System.out.println(s1);

        Singletone s2 = singletone.getInstance();

        System.out.println(s2);
    }

}
