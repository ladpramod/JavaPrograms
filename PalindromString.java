class Test{

    public static void main(String[] args) {
        
        String str = "Carac";

        String reverse = "";

        for(int i=str.length()-1; i>=0; i--)
        reverse = reverse + str.charAt(i);

        if(str.equalsIgnoreCase(reverse)){

            System.out.println("The given String is palindrom.");
        }else{

            System.out.println("The given string is not paindrom.");
        }
    }
}