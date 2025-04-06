package ex_07_Increment_Decrement_Operator;

public class Lab069_In_de_op {
    public static void main(String[] args) {

        // take input
        String age_String = args[0];
        String s1 = args[1];
        String s2= args[2];
        String s3 = args[3];
        String s4 = args[4]; // java.lang.ArrayIndexOutOfBoundsException

        int age = Integer.parseInt(age_String);

        System.out.println(age);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);


    }
}
