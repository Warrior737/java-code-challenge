package code.challenge.interviews;

public class ReverseString {

    public static void main(String[] args){

        String name = "Alonso";

        StringBuilder builder = new StringBuilder();

        for (int i = name.length() -1; i >= 0; i--) {
            builder.append(name.charAt(i));
        }
        System.out.println(builder);


    }
}
